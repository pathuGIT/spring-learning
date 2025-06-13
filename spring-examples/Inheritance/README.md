# Spring Configuration: Bean Inheritance

This README provides an overview of configuring bean inheritance in a Spring application using two methods: list-based and normal method-based approaches.

## List-Based Inheritance

In list-based inheritance, beans inherit configuration using lists of references to manage dependencies more flexibly.

### Example XML Configuration (`beans.xml`):

```xml
<!-- Parent bean configuration -->
<bean id="triangle" class="com.wak.demo.Triangle" abstract="true">
    <property name="points">
        <list>
            <ref bean="pointA"/>
        </list>
    </property>
</bean>

<!-- Child bean inheriting from parent -->
<bean id="triangle1" class="com.wak.demo.Triangle" parent="triangle">
    <property name="points">
        <list>
            <ref bean="pointB"/>
            <ref bean="pointC"/>
        </list>
    </property>
</bean>
```

## Normal Method-Based Inheritance

In normal method-based inheritance, dependencies between beans are managed using traditional setter methods.

### Example XML Configuration (`beans.xml`):

```xml
<!-- Parent bean configuration -->
<bean id="triangle" class="com.wak.demo.Triangle">
    <property name="pointA" ref="pointA"/>
</bean>

<!-- Child bean inheriting from parent -->
<bean id="triangle1" class="com.wak.demo.Triangle" parent="triangle">
    <property name="pointB" ref="pointB"/>
    <property name="pointC" ref="pointC"/>
</bean>


