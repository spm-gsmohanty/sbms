:book: **Spring IOC and DI**  
:one: Load the dependencies 

```xml
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-context</artifactId>
			<version>5.3.5</version>
		</dependency>
```
:two: configure beans in applicationContext.xml
```xml
 <bean id="productRepositoryImpl" class ="com.domain.repository.ProductRepositoryImpl"/>
```
:three: Instantiate the application context and get the bean

```java
	public static void main(String[] args) {
		System.out.println("Traditional App with Spring and IOC....");
//		ProductRepositoryImpl productRepositoryImpl = new ProductRepositoryImpl();
		// IOC & DI
		// Expecting the Spring Framework to inject the dependency.
		ProductRepositoryImpl productRepositoryImpl = null;
//		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
//				"applicationContext.xml");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		productRepositoryImpl = applicationContext.getBean("productRepositoryImpl", ProductRepositoryImpl.class);
		System.out.println(productRepositoryImpl.findAll());
		((ClassPathXmlApplicationContext) applicationContext).close();
	}
```
