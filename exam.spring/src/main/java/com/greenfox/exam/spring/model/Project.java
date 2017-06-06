package com.greenfox.exam.spring.model;

import javax.persistence.Id;

public class Project {

  long id;
  String nameOfProject;

  public Project(){
  }

  public Project(long id, String nameOfProject){
    this.id = id;
    this.nameOfProject = nameOfProject;
  }
}
