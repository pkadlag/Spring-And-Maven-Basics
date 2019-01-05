package com.capgemini.repositary;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.capgemini.model.Customer;
@Repository("customerRepositary")
public class HibernateCustomerRepositaryImp1 implements CustomerRepositary {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.capgemini.repositary.CustomerRepositary#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList();

		Customer customer = new Customer();
		customer.setFirstName("Punam");
		customer.setLastName("Kadlag");
		customers.add(customer);
		return customers;

	}
}
