package com.capgemini.app;

import com.capgemini.app.bean.Organization;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		Organization oe = (Organization) context.getBean("organization");

	System.out.println(oe);
		/*oe.getOrgId();
		oe.getName();
		oe.getShareValue();
		oe.isListed();
		oe.getBoardMembers();*/
	}
}
