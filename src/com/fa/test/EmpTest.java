package com.fa.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;



public class EmpTest {
	
	public void addData(String data) {
		
		if(data.equals(Constant.DATA_TYPE)) {
			System.out.println("Welcome to Java developer");
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Hi Rajesh Gurjar");
		
	}

}
