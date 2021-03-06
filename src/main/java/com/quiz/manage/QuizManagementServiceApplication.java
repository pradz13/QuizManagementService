package com.quiz.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ConfigurationPropertiesScan("com.quiz.manage.configuration")
@EnableSwagger2
public class QuizManagementServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuizManagementServiceApplication.class, args);
    }

	/*@Bean
	public CommandLineRunner mappingDemo(TopicService topicService,
										 QuestionService questionService) {
		return args -> {
			Topic topic = new Topic();
			topic.setTopicName("Bengali Films");
			long topicId = topicService.addTopic(topic).getTopicId();

			Question question = new Question();
			question.setQuestion("What is the latest web series from Hoichoi platform?");
			question.setCorrectAnswer("Hoichoi");
			AnswerOption answerOption1 = new AnswerOption();
			answerOption1.setQuestion(question);
			answerOption1.setAnswer("Hoichoi");
			AnswerOption answerOption2 = new AnswerOption();
			answerOption2.setQuestion(question);
			answerOption2.setAnswer("Hotstar");
			List<AnswerOption> answerOptionList = new ArrayList<>();
			answerOptionList.add(answerOption1);
			answerOptionList.add(answerOption2);
			question.setAnswerOptionList(answerOptionList);

			questionService.addQuestion(question, topicId);
		};
	}*/

}
