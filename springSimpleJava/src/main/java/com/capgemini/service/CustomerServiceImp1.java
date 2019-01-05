package com.capgemini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.model.Customer;
import com.capgemini.repositary.CustomerRepositary;

@Service("customerService")
public class CustomerServiceImp1 implements CustomerService {
	
	
	private CustomerRepositary customerRepositary;

	public CustomerServiceImp1()
	{
		
	}
	
	public CustomerServiceImp1(CustomerRepositary customerRepositary) {
		System.out.println("We are using constructor injection");
		this.customerRepositary = customerRepositary;
	}
	
	@Autowired
	public void setCustomerRepositary(CustomerRepositary customerRepositary) {

		System.out.println("We are using setter injection");
		this.customerRepositary = customerRepositary;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepositary.findAll();
	}
}
