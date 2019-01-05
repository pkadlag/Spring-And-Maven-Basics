package com.capgemini.service;

import java.util.List;

import com.capgemini.model.Customer;
import com.capgemini.repositary.CustomerRepositary;
import com.capgemini.repositary.HibernateCustomerRepositaryImp1;

public class CustomerServiceImp1 implements CustomerService {
	private CustomerRepositary customerRepositary = new HibernateCustomerRepositaryImp1();

	/* (non-Javadoc)
	 * @see com.capgemini.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepositary.findAll();
	}
}
