package com.greenfox.exam.spring.controller;

import com.greenfox.exam.spring.model.Question;
import com.greenfox.exam.spring.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class QuizRestController {

  @Autowired
  Question question;
  @Autowired
  QuestionRepository questionRepository;

  @GetMapping("/questions")
  public  List<Question> giveFiveQuestions(){
    long id = 1;
    List<Question> quizQuestions = new ArrayList<>();
    for (int i = 1; i < 6; i++){
      id = (long) (Math.random() * 10) + 1;
      Question question = questionRepository.findOne(id);
      quizQuestions.add(question);
    }
    return quizQuestions;
  }
}
