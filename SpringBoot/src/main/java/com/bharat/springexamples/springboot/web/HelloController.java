package com.bharat.springexamples.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bharatkosti on 3/25/15.
 */
@RestController
public class HelloController {
  
  @RequestMapping("/")
  public String hello(){
    return "Hello From Spring Boot";
    
  }

}
