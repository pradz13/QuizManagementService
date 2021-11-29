package com.quiz.manage.controller;

import com.quiz.manage.entities.Topic;
import com.quiz.manage.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @PostMapping("/addTopic")
    public Topic addTopic(@RequestBody Topic topic) {
        return topicService.addTopic(topic);
    }
}
