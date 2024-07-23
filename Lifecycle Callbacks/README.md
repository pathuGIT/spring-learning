## AbstractApplicationContext 

```java
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
	}

}
```

### Using default-init-method & default-destroy-method
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans default-init-method="myInit" default-destroy-method="cleanUp">
    <bean id="triangle" class="com.wak.demo.Triangle">
        <property name="pointA" ref="pointA"/>
        <property name="pointB" ref="pointB"/>
        <property name="pointC" ref="pointC"/>
    </bean>
 </beans>   
```

### Using InitializingBean & DisposableBean

```java
public class Triangle implements InitializingBean, DisposableBean {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy callled");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet callled");
    }
}

