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

  @Query("SELECT t FROM Tutorial t WHERE t.title LIKE %?1% AND t.major LIKE %?2% AND CONCAT(question1, question2, question3, question4, question5, question6, question7, question8, question9, question10, question11, question12, question13 , question14, question15) LIKE %?3% AND concat(answer1, answer2, answer3, answer4, answer5, answer6, answer7, answer8, answer9, answer10, answer11, answer12, answer13 , answer14, answer15) LIKE  %?4% AND t.result LIKE %?5% ")
  
  //@Query("SELECT t FROM Tutorial t WHERE t.title LIKE %?1% AND t.major LIKE %?2% AND t.question1 LIKE %?3% AND t.answer1 LIKE  %?4% AND t.result LIKE %?5% ")
  List<Tutorial> queryByKeySearch(String titleSearch, String majorSearch, String questionSearch, String answerSearch, String resultSearch);
}
