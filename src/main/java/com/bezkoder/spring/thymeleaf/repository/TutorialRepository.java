package com.bezkoder.spring.thymeleaf.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bezkoder.spring.thymeleaf.entity.Tutorial;

@Repository
@Transactional
public interface TutorialRepository extends JpaRepository<Tutorial, Integer> {
  List<Tutorial> findByTitleContainingIgnoreCase(String keyword);

  @Query("UPDATE Tutorial t SET t.published = :published WHERE t.id = :id")
  @Modifying
  public void updatePublishedStatus(Integer id, boolean published);

  //@Query("SELECT t FROM Tutorial t WHERE ( ?1 is NULL OR t.title LIKE %?1%) AND ( ?2 is NULL OR t.major LIKE %?2%) AND ( ?3 is NULL OR CONCAT(question1, question2, question3, question4, question5, question6, question7, question8, question9, question10, question11, question12, question13 , question14, question15)  LIKE %?3% ) AND ( ?4 is NULL OR concat(answer1, answer2, answer3, answer4, answer5, answer6, answer7, answer8, answer9, answer10, answer11, answer12, answer13 , answer14, answer15) LIKE  %?4% ) AND ( ?5 is NULL OR t.result LIKE %?5%) ")
  @Query("SELECT t FROM Tutorial t WHERE ( ?1 is NULL OR t.title LIKE %?1%)   AND ( ?2 is NULL OR t.major LIKE %?2%) AND ( ?3 is NULL OR CONCAT(question1, question2, question3, question4, question5, question6, question7, question8, question9, question10, question11, question12, question13 , question14, question15)  LIKE %?3% ) AND ( ?4 is NULL OR concat(t.answer1, t.answer2, t.answer3, t.answer4, t.answer5, t.answer6, t.answer7, t.answer8, t.answer9, t.answer10, t.answer11, t.answer12, t.answer13 , t.answer14, t.answer15) LIKE  %?4% ) AND ( ?5 is NULL OR t.result LIKE %?5% ) ")
  
  List<Tutorial> queryByKeySearch(String titleSearch, String majorSearch, String questionSearch, String answerSearch, String resultSearch);
}
