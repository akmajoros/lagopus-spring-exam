package com.greenfox.exam.spring.repository;

import com.greenfox.exam.spring.model.Question;
import org.springframework.data.repository.CrudRepository;

public interface QuizRepository extends CrudRepository<Question, Long>{
}
