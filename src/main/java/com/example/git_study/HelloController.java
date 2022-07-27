package com.example.git_study;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class HelloController {

  GetYmlValue a;

  public HelloController(GetYmlValue a) {
    this.a = a;
  }

  @GetMapping("/")
  public String HelloMethod() {

    System.out.println(a.getValue());
    return a.getValue();
  }
}
