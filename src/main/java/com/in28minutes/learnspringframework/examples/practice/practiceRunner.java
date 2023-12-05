package com.in28minutes.learnspringframework.examples.practice;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class practiceRunner {
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(practiceRunner.class);) {

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		}
	}
}
