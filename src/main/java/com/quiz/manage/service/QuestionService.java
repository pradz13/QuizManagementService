package com.quiz.manage.service;

import com.quiz.manage.entities.Question;
import com.quiz.manage.entities.Topic;
import com.quiz.manage.repository.QuestionRepository;
import com.quiz.manage.repository.TopicRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import java.util.Optional;

@Service
public class QuestionService {
    Logger logger = LoggerFactory.getLogger(TopicService.class);

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private TopicRepository topicRepository;

    /**
     * Method for adding a question to the database
     *
     * @param question Refers to a question
     * @param topicId  Refers to a topic
     * @return returns the instance of the inserted Question in the database
     */
    @Transactional
    public Topic addQuestion(Question question, long topicId) {
        logger.info("Finding the topic for the topic id : {}", topicId);
        Optional<Topic> optionalTopic = topicRepository.findById(topicId);
        if (optionalTopic.isPresent()) {
            Topic topic = optionalTopic.get();
            logger.info("Found the topic : {} for the topic id : {}", topic.getTopicName(), topic.getTopicId());
            topic.addQuestion(question);
            topicRepository.save(topic);
            logger.info("Associating the question with topic id : {} completed successfully", topic.getTopicId());
            return topic;
        } else {
            logger.error("No topic found for topic id : {}", topicId);
            //TODO - Throw Exception and rollback the transaction
        }
        return null;
    }
}
