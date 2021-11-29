package com.quiz.manage.service;

import com.quiz.manage.entities.Topic;
import com.quiz.manage.repository.TopicRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
public class TopicService {

    Logger logger = LoggerFactory.getLogger(TopicService.class);

    @Autowired
    private TopicRepository topicRepository;

    /**
     * Method for adding a topic to the database
     *
     * @param topic Refers to a topic
     * @return returns the instance of the inserted Topic in the database
     */
    @Transactional
    public Topic addTopic(Topic topic) {
        logger.info("Adding the topic with name : {}", topic.getTopicName());
        Topic addedTopic = topicRepository.save(topic);
        logger.info("Topic with name : {} successfully added to the database", topic.getTopicName());
        return addedTopic;
    }
}
