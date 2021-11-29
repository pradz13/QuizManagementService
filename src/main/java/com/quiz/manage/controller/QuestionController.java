package com.quiz.manage.controller;

import com.quiz.manage.entities.Topic;
import com.quiz.manage.model.QuestionModel;
import com.quiz.manage.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @PostMapping("/addQuestion")
    public Topic addQuestion(@RequestBody QuestionModel questionModel) {
        return questionService.addQuestion(questionModel.getQuestion(), questionModel.getTopicId());
    }
}
