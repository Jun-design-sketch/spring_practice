package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {
};

record Address(String firstLine, String city) {
};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Jun";
	}

	@Bean
	public int age() {
		return 17;
	}

	@Bean
	public Person person() {
		return new Person("Ravi", 20, new Address("Japan", "Osaka"));
	}

	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address()); // name, age
	}

	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		return new Person(name, age, address3);
	}

	@Bean(name = "address2")
	public Address address() {
		return new Address("Japan", "Tokyo");
	}

	@Bean(name = "address3")
	public Address address3() {
		return new Address("Street", "CityName");
	}
}
