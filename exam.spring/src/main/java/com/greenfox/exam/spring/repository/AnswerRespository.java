package com.greenfox.exam.spring.repository;

import com.greenfox.exam.spring.model.Answer;
import org.springframework.data.repository.CrudRepository;

public interface AnswerRespository extends CrudRepository<Answer, Long> {
}
