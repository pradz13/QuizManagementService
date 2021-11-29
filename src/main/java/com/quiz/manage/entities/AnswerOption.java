package com.quiz.manage.entities;

import javax.persistence.*;

@Entity
@Table(name = "ANSWER_OPTION")
public class AnswerOption {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long answerId;

    private String answer;

    @ManyToOne
    private Question question;

    public long getAnswerId() {
        return answerId;
    }

    public void setAnswerId(long answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "AnswerOption{" +
                "answerId=" + answerId +
                ", answer='" + answer + '\'' +
                ", question=" + question +
                '}';
    }
}
