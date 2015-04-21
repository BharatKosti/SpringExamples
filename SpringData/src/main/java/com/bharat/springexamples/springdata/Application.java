package com.bharat.springexamples.springdata;

import com.bharat.springexamples.springdata.entity.Customer;
import com.bharat.springexamples.springdata.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by bharatkosti on 4/15/15.
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

  @Autowired
  private CustomerRepository customerRepository;

  public static void main(String[] args)
  {
    SpringApplication.run(Application.class);
  }


  @Override
  public void run(String... args) throws Exception {

    // save a couple of customers
    customerRepository.save(new Customer("Jack", "Bauer"));
    customerRepository.save(new Customer("Chloe", "O'Brian"));
    customerRepository.save(new Customer("Kim", "Bauer"));
    customerRepository.save(new Customer("David", "Palmer"));
    customerRepository.save(new Customer("Michelle", "Dessler"));

    // fetch all customers
    //System.out.println("Customers found with findAll():");
    //System.out.println("-------------------------------");

    //System.out.println("Bharat");
    for (Customer customer : customerRepository.findAll()) {
      System.out.println(customer);
    }
    System.out.println();

    // fetch an individual customer by ID
    Customer customer = customerRepository.findOne(1L);
    //System.out.println("Customer found with findOne(1L):");
    //System.out.println("--------------------------------");
    System.out.println(customer);
    System.out.println();

    // fetch customers by last name
    //System.out.println("Customer found with findByLastName('Bauer'):");
    //System.out.println("--------------------------------------------");
    for (Customer bauer : customerRepository.findByLastName("Bauer")) {
      System.out.println(bauer);
    }

  }
}
