package com.example.git_study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitStudyApplication {

  public static void main(String[] args) {
    System.out.println("ci test");
    SpringApplication.run(GitStudyApplication.class, args);
  }

}
