package com.example.git_study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class GitStudyApplication {

  public static void main(String[] args) {
    System.out.println("ci test");
    SpringApplication.run(GitStudyApplication.class, args);
  }

}
