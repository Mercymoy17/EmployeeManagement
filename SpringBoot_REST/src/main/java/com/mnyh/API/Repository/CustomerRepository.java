package com.mnyh.API.Repository;

import org.springframework.data.repository.CrudRepository;

import com.mnyh.API.Entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{}
