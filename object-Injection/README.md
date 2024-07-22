# Spring Basics

This repository covers fundamental concepts in Spring, including Object Injection, Inner Beans, and Aliases. These examples are intended for beginners to help them understand and practice key features of the Spring Framework.

## Table of Contents

1. [Object Injection](#object-injection)
2. [Inner Beans](#inner-beans)
3. [Aliases](#aliases)

## Object Injection

Object Injection is a core concept in Spring that involves injecting dependencies into an object at runtime. This allows for loose coupling between components, making the code more modular and easier to maintain.

### Example

```java
// Car.java
public class Car {
    private Engine engine;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }
}

// Engine.java
public class Engine {
    public void start() {
        System.out.println("Engine started.");
    }
}

// applicationContext.xml
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
           http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="engine" class="com.example.Engine"/>
    <bean id="car" class="com.example.Car">
        <property name="engine" ref="engine"/>
    </bean>
</beans>
