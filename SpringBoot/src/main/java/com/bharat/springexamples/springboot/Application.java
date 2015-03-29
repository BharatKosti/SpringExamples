package com.bharat.springexamples.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.websocket.WebSocketAutoConfiguration;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

/**
 * Created by bharatkosti on 3/25/15.
 */
@SpringBootApplication(exclude = {WebSocketAutoConfiguration.class})
public class Application {
  
  public static void main(String args[]){
    ApplicationContext ctx = SpringApplication.run(Application.class,args);

    String[] beanNames = ctx.getBeanDefinitionNames();
    Arrays.sort(beanNames);
    for (String beanName : beanNames) {
      System.out.println(beanName);
    }
    
  }

}
 

