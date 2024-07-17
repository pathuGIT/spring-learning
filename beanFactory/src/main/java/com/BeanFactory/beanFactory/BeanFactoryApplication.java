package com.BeanFactory.beanFactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BeanFactoryApplication {

	public static void main(String[] args) {
		ApplicationContext fact = SpringApplication.run(BeanFactoryApplication.class, args);
		Student student3 = (Student) fact.getBean("student");

//		used BeanFactory
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("bean-factory-demo.xml");
		Student student1 = (Student) beanFactory.getBean("student");

//		used ApplicationContext
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-factory-demo.xml");
		Student student2 = (Student) applicationContext.getBean("student");



		System.out.println(student1);
		System.out.println(student2);
		student3.say();
	}

}
