package com.sudhir.service;

import java.util.Calendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sudhir.dto.Address;
import com.sudhir.dto.UserDetails;

public class UserService {

	public static void main(String[] args) {
		UserDetails userDetails = new UserDetails();
		//userDetails.setId(new Long(9));
		
		Address address = new Address();
		address.setCity("Hyderabad");
		address.setPincode(800031);
		address.setState("Telangana");
		address.setStreet("Mid town street");
		
		userDetails.setName("Roney");
		userDetails.setAddress(address);
		userDetails.setDoj(Calendar.getInstance().getTime());
		userDetails.setUsername("Roney");
		userDetails.setDescription("James Roney's description");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(userDetails);
		session.getTransaction().commit();
		session.close();
		
		session = sessionFactory.openSession();
		session.beginTransaction();
		UserDetails userDetails2 = session.get(UserDetails.class,new Long(1));
		System.out.println("Name = "+userDetails2.getName()+
							"\nUserName = "+userDetails2.getUsername()+
							"\nAddress = "+userDetails2.getAddress()+
							"\nDOJ = "+userDetails2.getDoj()+
							"\nId = "+userDetails2.getId()+
							"\nAddress => \n\tStreet = "+userDetails2.getAddress().getStreet()+
							"\n\tCity = "+userDetails2.getAddress().getCity()+
							"\n\tState = "+userDetails2.getAddress().getState()+
							"\n\tPncode = "+userDetails2.getAddress().getPincode());
		session.close();
	}

}
