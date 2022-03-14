package com.customer;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateClient {

	public static void main(String[] args) {

Configuration cfg = new Configuration();
cfg.configure();

SessionFactory sft = cfg.buildSessionFactory();
System.out.println("table created .....");

sft.close();

	}

}
