package com.greenfox.exam.spring.model;

import java.util.List;

public class Response {

  long id;
  List<Answer> answers;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public List<Answer> getAnswers() {
    return answers;
  }

  public void setAnswers(List<Answer> answers) {
    this.answers = answers;
  }
}
