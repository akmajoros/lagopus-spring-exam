package com.greenfox.exam.spring.model;


import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;

@Component
public class CorrectAnswers {
  long id;
  String answer;
}
