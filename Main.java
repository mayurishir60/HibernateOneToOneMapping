package com.test;

import java.util.Date;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();

		configuration.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Customer Name:");
		String name = scanner.next();

		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter the Customer Mobile number:");
		String number = scanner.next();

		Customer customer = new Customer();

		customer.setFirstName(name);
		customer.setMobileNumber(number);

		Transection transection = new Transection();

		transection.setDate(new Date());
		transection.setTotal(4000);

		customer.setTransection(transection);

		session.save(customer);
		transaction.commit();
		session.close();
		sessionFactory.close();

		System.out.println("Record Inserted Successfully......................");

	}

}
