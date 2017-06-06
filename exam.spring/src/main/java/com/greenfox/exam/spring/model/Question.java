package com.greenfox.exam.spring.model;

import com.greenfox.exam.spring.repository.QuizRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Component
public class Question {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;

  String question;

  public Question(){
  }

  public Question(String question){
    this.question = question;
  }

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }
}
