package com.romain.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.romain.aopdemo.dao.AccountDAO;
import com.romain.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		// read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		
		// call the business method
		theAccountDAO.addAccount();
		theAccountDAO.addSillyMember();
		theMembershipDAO.addAccount();
		
		
		// close the context
		context.close();
	}

}
