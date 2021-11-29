package com.quiz.manage.model;

import com.quiz.manage.entities.Question;

public class QuestionModel {
    private Question  question;
    private long topicId;

    public QuestionModel() {
        super();
    }

    public QuestionModel(Question question, long topicId) {
        this.question = question;
        this.topicId = topicId;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public long getTopicId() {
        return topicId;
    }

    public void setTopicId(long topicId) {
        this.topicId = topicId;
    }

    @Override
    public String toString() {
        return "QuestionModel{" +
                "question=" + question +
                ", topicId=" + topicId +
                '}';
    }
}
