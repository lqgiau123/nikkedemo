package com.bezkoder.spring.thymeleaf.entity;

import javax.persistence.*;

@Entity
@Table(name = "tutorials")
public class Tutorial {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;


  @Column(length = 256)
  private String description;

  @Column(nullable = false)
  private int level;

  @Column(nullable = false)
  private int createNumber;

  @Column(nullable = false)
  private int contentNumber;

  @Column
  private boolean published;

  @Column(columnDefinition="TEXT")
  private String result;


  @Column(length = 255, nullable = false)
  private String title;

  @Column(length = 255)
  private String major;

  @Column(length = 255)
  private String createBy;

  @Column(length = 255)
  private String createAt;

  @Column(length = 255)
  private String question1;

  @Column(length = 255)
  private String answer1;

  @Column(length = 255)
  private String question2;

  @Column(length = 255)
  private String answer2;

  @Column(length = 255)
  private String question3;

  @Column(length = 255)
  private String answer3;

   @Column(length = 255)
  private String question4;

  @Column(length = 255)
  private String answer4;

  @Column(length = 255)
  private String question5;

  @Column(length = 255)
  private String answer5;

   @Column(length = 255)
  private String question6;

  @Column(length = 255)
  private String answer6;

  @Column(length = 255)
  private String question7;

  @Column(length = 255)
  private String answer7;

   @Column(length = 255)
  private String question8;

  @Column(length = 255)
  private String answer8;

  @Column(length = 255)
  private String question9;

  @Column(length = 255)
  private String answer9;

  @Column(length = 255)
  private String question10;

  @Column(length = 255)
  private String answer10;

  @Column(length = 255)
  private String question11;

  @Column(length = 255)
  private String answer11;

  @Column(length = 255)
  private String question12;

  @Column(length = 255)
  private String answer12;

  @Column(length = 255)
  private String question13;

  @Column(length = 255)
  private String answer13;

   @Column(length = 255)
  private String question14;

  @Column(length = 255)
  private String answer14;

  @Column(length = 255)
  private String question15;

  @Column(length = 255)
  private String answer15;

  public Tutorial() {

  }

  public Tutorial(String title, String description, int level, boolean published) {
    this.title = title;
    this.description = description;
    this.level = level;
    this.published = published;
  }

 
  @Override
  public String toString() {
    return "Tutorial [id=" + id + ", title=" + title + ", description=" + description + ", level=" + level
        + ", published=" + published + "]";
  }

    /**
     * @return Integer return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return String return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return int return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * @return boolean return the published
     */
    public boolean isPublished() {
        return published;
    }

    /**
     * @param published the published to set
     */
    public void setPublished(boolean published) {
        this.published = published;
    }

    /**
     * @return int return the idService
     */

    /**
     * @return String return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return String return the major
     */
    public String getMajor() {
        return major;
    }

    /**
     * @param major the major to set
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * @return String return the createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * @param createBy the createBy to set
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * @return String return the createAt
     */
    public String getCreateAt() {
        return createAt;
    }

    /**
     * @param createAt the createAt to set
     */
    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    /**
     * @return String return the question1
     */
    public String getQuestion1() {
        return question1;
    }

    /**
     * @param question1 the question1 to set
     */
    public void setQuestion1(String question1) {
        this.question1 = question1;
    }

    /**
     * @return String return the answer1
     */
    public String getAnswer1() {
        return answer1;
    }

    /**
     * @param answer1 the answer1 to set
     */
    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    /**
     * @return String return the question2
     */
    public String getQuestion2() {
        return question2;
    }

    /**
     * @param question2 the question2 to set
     */
    public void setQuestion2(String question2) {
        this.question2 = question2;
    }

    /**
     * @return String return the answer2
     */
    public String getAnswer2() {
        return answer2;
    }

    /**
     * @param answer2 the answer2 to set
     */
    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    /**
     * @return String return the question3
     */
    public String getQuestion3() {
        return question3;
    }

    /**
     * @param question3 the question3 to set
     */
    public void setQuestion3(String question3) {
        this.question3 = question3;
    }

    /**
     * @return String return the answer3
     */
    public String getAnswer3() {
        return answer3;
    }

    /**
     * @param answer3 the answer3 to set
     */
    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    /**
     * @return String return the question4
     */
    public String getQuestion4() {
        return question4;
    }

    /**
     * @param question4 the question4 to set
     */
    public void setQuestion4(String question4) {
        this.question4 = question4;
    }

    /**
     * @return String return the answer4
     */
    public String getAnswer4() {
        return answer4;
    }

    /**
     * @param answer4 the answer4 to set
     */
    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    /**
     * @return String return the question5
     */
    public String getQuestion5() {
        return question5;
    }

    /**
     * @param question5 the question5 to set
     */
    public void setQuestion5(String question5) {
        this.question5 = question5;
    }

    /**
     * @return String return the answer5
     */
    public String getAnswer5() {
        return answer5;
    }

    /**
     * @param answer5 the answer5 to set
     */
    public void setAnswer5(String answer5) {
        this.answer5 = answer5;
    }

    /**
     * @return String return the question6
     */
    public String getQuestion6() {
        return question6;
    }

    /**
     * @param question6 the question6 to set
     */
    public void setQuestion6(String question6) {
        this.question6 = question6;
    }

    /**
     * @return String return the answer6
     */
    public String getAnswer6() {
        return answer6;
    }

    /**
     * @param answer6 the answer6 to set
     */
    public void setAnswer6(String answer6) {
        this.answer6 = answer6;
    }

    /**
     * @return String return the question7
     */
    public String getQuestion7() {
        return question7;
    }

    /**
     * @param question7 the question7 to set
     */
    public void setQuestion7(String question7) {
        this.question7 = question7;
    }

    /**
     * @return String return the answer7
     */
    public String getAnswer7() {
        return answer7;
    }

    /**
     * @param answer7 the answer7 to set
     */
    public void setAnswer7(String answer7) {
        this.answer7 = answer7;
    }

    /**
     * @return String return the question8
     */
    public String getQuestion8() {
        return question8;
    }

    /**
     * @param question8 the question8 to set
     */
    public void setQuestion8(String question8) {
        this.question8 = question8;
    }

    /**
     * @return String return the answer8
     */
    public String getAnswer8() {
        return answer8;
    }

    /**
     * @param answer8 the answer8 to set
     */
    public void setAnswer8(String answer8) {
        this.answer8 = answer8;
    }

    /**
     * @return String return the question9
     */
    public String getQuestion9() {
        return question9;
    }

    /**
     * @param question9 the question9 to set
     */
    public void setQuestion9(String question9) {
        this.question9 = question9;
    }

    /**
     * @return String return the answer9
     */
    public String getAnswer9() {
        return answer9;
    }

    /**
     * @param answer9 the answer9 to set
     */
    public void setAnswer9(String answer9) {
        this.answer9 = answer9;
    }

    /**
     * @return String return the question10
     */
    public String getQuestion10() {
        return question10;
    }

    /**
     * @param question10 the question10 to set
     */
    public void setQuestion10(String question10) {
        this.question10 = question10;
    }

    /**
     * @return String return the answer10
     */
    public String getAnswer10() {
        return answer10;
    }

    /**
     * @param answer10 the answer10 to set
     */
    public void setAnswer10(String answer10) {
        this.answer10 = answer10;
    }

    /**
     * @return String return the question11
     */
    public String getQuestion11() {
        return question11;
    }

    /**
     * @param question11 the question11 to set
     */
    public void setQuestion11(String question11) {
        this.question11 = question11;
    }

    /**
     * @return String return the answer11
     */
    public String getAnswer11() {
        return answer11;
    }

    /**
     * @param answer11 the answer11 to set
     */
    public void setAnswer11(String answer11) {
        this.answer11 = answer11;
    }

    /**
     * @return String return the question12
     */
    public String getQuestion12() {
        return question12;
    }

    /**
     * @param question12 the question12 to set
     */
    public void setQuestion12(String question12) {
        this.question12 = question12;
    }

    /**
     * @return String return the answer12
     */
    public String getAnswer12() {
        return answer12;
    }

    /**
     * @param answer12 the answer12 to set
     */
    public void setAnswer12(String answer12) {
        this.answer12 = answer12;
    }

    /**
     * @return String return the question13
     */
    public String getQuestion13() {
        return question13;
    }

    /**
     * @param question13 the question13 to set
     */
    public void setQuestion13(String question13) {
        this.question13 = question13;
    }

    /**
     * @return String return the answer13
     */
    public String getAnswer13() {
        return answer13;
    }

    /**
     * @param answer13 the answer13 to set
     */
    public void setAnswer13(String answer13) {
        this.answer13 = answer13;
    }

    /**
     * @return String return the question14
     */
    public String getQuestion14() {
        return question14;
    }

    /**
     * @param question14 the question14 to set
     */
    public void setQuestion14(String question14) {
        this.question14 = question14;
    }

    /**
     * @return String return the answer14
     */
    public String getAnswer14() {
        return answer14;
    }

    /**
     * @param answer14 the answer14 to set
     */
    public void setAnswer14(String answer14) {
        this.answer14 = answer14;
    }

    /**
     * @return String return the question15
     */
    public String getQuestion15() {
        return question15;
    }

    /**
     * @param question15 the question15 to set
     */
    public void setQuestion15(String question15) {
        this.question15 = question15;
    }

    /**
     * @return String return the answer15
     */
    public String getAnswer15() {
        return answer15;
    }

    /**
     * @param answer15 the answer15 to set
     */
    public void setAnswer15(String answer15) {
        this.answer15 = answer15;
    }

    


    /**
     * @return int return the createNumber
     */
    public int getCreateNumber() {
        return createNumber;
    }

    /**
     * @param createNumber the createNumber to set
     */
    public void setCreateNumber(int createNumber) {
        this.createNumber = createNumber;
    }

    /**
     * @return int return the contentNumber
     */
    public int getContentNumber() {
        return contentNumber;
    }

    /**
     * @param contentNumber the contentNumber to set
     */
    public void setContentNumber(int contentNumber) {
        this.contentNumber = contentNumber;
    }


    /**
     * @return String return the result
     */
    public String getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(String result) {
        this.result = result;
    }

}
