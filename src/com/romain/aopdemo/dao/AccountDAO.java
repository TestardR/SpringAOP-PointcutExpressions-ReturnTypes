package com.romain.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	
	public void addAccount() {
		System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
	}
	
	public boolean addSillyMember() {
		System.out.println(getClass() + ": DOING MY DB WORK: ADDING A SILLY MEMBER");
		return true;
	}

}
