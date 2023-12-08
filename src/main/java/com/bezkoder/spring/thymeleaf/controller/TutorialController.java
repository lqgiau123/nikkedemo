package com.bezkoder.spring.thymeleaf.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bezkoder.spring.thymeleaf.dto.ChatBotRequest;
import com.bezkoder.spring.thymeleaf.dto.ChatBotResponse;
import com.bezkoder.spring.thymeleaf.dto.Message;
import com.bezkoder.spring.thymeleaf.entity.Tutorial;
import com.bezkoder.spring.thymeleaf.repository.TutorialRepository;

@Controller
public class TutorialController {

	@Autowired
	private TutorialRepository tutorialRepository;

	@Qualifier("openaiRestTemplate")
	@Autowired
	private RestTemplate restTemplate;

	@Value("${openai.chatgtp.model}")
	private String modelGPT;

	@Value("${openai.chatgtp.max-completions}")
	private int maxCompletions;

	@Value("${openai.chatgtp.temperature}")
	private double temperature;

	@Value("${openai.chatgtp.api.stop}")
	private String stop;

	@Value("${openai.chatgtp.max_tokens}")
	private int maxTokens;

	@Value("${openai.chatgtp.api.url}")
	private String apiUrl;

	/* Create DateTime */
	public static String getCurrentTimeStamp() {
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		Date now = new Date();
		String strDate = sdfDate.format(now);
		return strDate;
	}

	@GetMapping("/")
	public String Home(Model model) {
		return "redirect:/demo";

	}

	@GetMapping("/demo")
	public String getAll(Model model, @Param("titleSearch") String titleSearch,
			@Param("majorSearch") String majorSearch, @Param("questionSearch") String questionSearch,
			@Param("answerSearch") String answerSearch, @Param("resultSearch") String resultSearch) {
		try {
			List<Tutorial> tutorials = new ArrayList<Tutorial>();
			if ((titleSearch == null || titleSearch == "") && (majorSearch == null || majorSearch == "")
					&& (questionSearch == null || questionSearch == "") && (answerSearch == null || answerSearch == "")
					&& (resultSearch == null || resultSearch == "")) {
				tutorials = tutorialRepository.findAll();
				model.addAttribute("tutorials", tutorials);

			} else {
				tutorials = tutorialRepository.queryByKeySearch(titleSearch, majorSearch, questionSearch, answerSearch,
						resultSearch);
				model.addAttribute("titleSearch", titleSearch);
				model.addAttribute("majorSearch", majorSearch);
				model.addAttribute("questionSearch", questionSearch);
				model.addAttribute("answerSearch", answerSearch);
				model.addAttribute("resultSearch", resultSearch);
				model.addAttribute("tutorials", tutorials);
			}
		} catch (Exception e) {
			model.addAttribute("message", e.getMessage());
		}

		return "tutorials";
	}

	@GetMapping("/demo/new")
	public String addTutorial(Model model) {
		Tutorial tutorial = new Tutorial();
		model.addAttribute("tutorial", tutorial);
		model.addAttribute("pageTitle", "生成画面");

		return "tutorial_form";
	}

	// @PostMapping("/tutorials/save")
	@RequestMapping(value = "/demo/save", method = RequestMethod.POST, params = "save")
	public String saveTutorial(Tutorial tutorial, RedirectAttributes redirectAttributes, Model model) {
		try {
			tutorial.setCreateBy("demo");
			tutorial.setCreateAt(getCurrentTimeStamp());
			tutorialRepository.save(tutorial);
			redirectAttributes.addFlashAttribute("message", "The Content has been saved successfully!");
		} catch (Exception e) {
			redirectAttributes.addAttribute("message", e.getMessage());
		}

		return "redirect:/demo";
	}

	// save and call API
	@RequestMapping(value = "/demo/save", method = RequestMethod.POST, params = "saveandcall")
	public String saveAndCallGPT(Tutorial tutorial, RedirectAttributes redirectAttributes) {
		// call api
		String prompt = tutorial.toString();

		// create a request
		ChatBotRequest request = new ChatBotRequest(modelGPT,
				List.of(new Message("assistant", prompt)),
				maxCompletions,
				temperature,
				maxTokens,
				stop);

		// call the API
		try {
			ChatBotResponse response = restTemplate.postForObject(apiUrl, request, ChatBotResponse.class);
			if (response == null || response.getChoices() == null || response.getChoices().isEmpty()) {
				// save data
				tutorialRepository.save(tutorial);
				return "No response";
			} else {
				tutorial.setResult(response.getChoices().get(0).getMessage().getContent());
				System.out.println(response.getChoices().get(0).getMessage().getContent());
				// save data
				try {
					tutorialRepository.save(tutorial);
					redirectAttributes.addFlashAttribute("message", "The Content has been saved successfully!");
				} catch (Exception e) {
					redirectAttributes.addAttribute("message", e.getMessage());
				}
			}
		} catch (Exception e) {
			redirectAttributes.addAttribute("message", e.getMessage());
		}

		return "redirect:/demo/" + tutorial.getId();
	}

	@GetMapping("/demo/{id}")
	public String editTutorial(@PathVariable("id") Integer id, Model model, RedirectAttributes redirectAttributes) {
		try {
			Tutorial tutorial = tutorialRepository.findById(id).get();

			model.addAttribute("tutorial", tutorial);
			model.addAttribute("pageTitle", "編集画面");
			return "tutorial_form";
		} catch (Exception e) {
			redirectAttributes.addFlashAttribute("message", e.getMessage());
			return "redirect:/demo";
		}
	}

}
