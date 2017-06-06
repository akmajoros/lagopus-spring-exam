package com.greenfox.exam.spring.controller;

import com.greenfox.exam.spring.model.Question;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@NoArgsConstructor
@AllArgsConstructor
public class QuestionController {

  @Autowired
  Question question;


}
