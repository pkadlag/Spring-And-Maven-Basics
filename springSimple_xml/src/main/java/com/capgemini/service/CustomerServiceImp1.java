package com.capgemini.service;

import java.util.List;

import com.capgemini.model.Customer;
import com.capgemini.repositary.CustomerRepositary;

public class CustomerServiceImp1 implements CustomerService {
	private CustomerRepositary customerRepositary;

	@Override
	public List<Customer> findAll() {
		return customerRepositary.findAll();
	}

	public void setCustomerRepositary(CustomerRepositary customerRepositary) {
		this.customerRepositary = customerRepositary;
	}
}
