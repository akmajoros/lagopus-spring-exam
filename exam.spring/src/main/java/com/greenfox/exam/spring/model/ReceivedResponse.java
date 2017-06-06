package com.greenfox.exam.spring.model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ReceivedResponse {
  List<Project> projectList;

  public void fillProject(List<Project> projectList){
    projectList.add(new Project(1, "Project 1"));
    projectList.add(new Project(2, "Project 2"));
    projectList.add(new Project(3, "Project 3"));
    projectList.add(new Project(4, "Project 4"));
    projectList.add(new Project(5, "Project 5"));
  }
}
