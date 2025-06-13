package com.BeanFactory.beanFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Autowired
    private Subject subject;

    private String name;
    private String age;
    private String city;

    public Student(String name, String age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public Student(){

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", age='" + city + '\'' +
                '}';
    }

    public void say(){
        subject.Hello();
    }
}
