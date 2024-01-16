package com.bezkoder.spring.thymeleaf.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tutorials")
public class Tutorial {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(nullable = false)
	private int createNumber;

	@Column(nullable = false)
	private int contentNumber;

	@Column(columnDefinition = "TEXT")
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

	@Override
	public String toString() {
		return "あなたはプレスリリースを作る業界No.1のプロです。\\n"
				+ "以下の質問と回答をもとに最高のプレスリリースを" + createNumber + "つ提案してください。\\n"
				+ "それぞれのプレスリリースはタイトルと文章のセットで作ってください。\\n"
				+ "文章は" + contentNumber + "文字以内で作ってください。\\n"
				+ "質問1." + question1 + "\\n" + "回答1." + answer1 + "\\n"
				+ "質問2." + question1 + "\\n" + "回答2." + answer1 + "\\n"
				+ "質問3." + question1 + "\\n" + "回答3." + answer1 + "\\n"
				+ "質問4." + question1 + "\\n" + "回答4." + answer1 + "\\n"
				+ "質問5." + question1 + "\\n" + "回答5." + answer1 + "\\n"
				+ "質問6." + question1 + "\\n" + "回答6." + answer1 + "\\n"
				+ "質問7." + question1 + "\\n" + "回答7." + answer1 + "\\n"
				+ "質問8." + question1 + "\\n" + "回答8." + answer1 + "\\n"
				+ "質問9." + question1 + "\\n" + "回答9." + answer1 + "\\n"
				+ "質問10." + question1 + "\\n" + "回答10." + answer1 + "\\n"
				+ "質問11." + question1 + "\\n" + "回答11." + answer1 + "\\n";
	}

}