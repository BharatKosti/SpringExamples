package com.bharat.springexamples.springdata.repository;

import com.bharat.springexamples.springdata.entity.Customer;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by bharatkosti on 4/15/15.
 */
public interface CustomerRepository extends CrudRepository<Customer,Long> {

  public List<Customer> findByLastName(String lastName);

}
