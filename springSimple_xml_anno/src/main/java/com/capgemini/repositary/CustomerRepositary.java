package com.capgemini.repositary;

import java.util.List;

import com.capgemini.model.Customer;

public interface CustomerRepositary {

	List<Customer> findAll();

}