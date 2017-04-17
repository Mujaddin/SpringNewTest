package com.mitrais.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringIoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIoApplication.class, args);
	}

	// @Bean
	// public CommandLineRunner printAll(ApplicationContext ctx){
	// 	return args->{
	// 	System.out.println("Hello World");
	// 	};
	// }
	// @Bean
	// public CommandLineRunner printAll(ApplicationContext ctx) {
	// 	return args -> {
	// 		System.out.println("All beans provide by Jamal");
	// 		String[] beanNames = ctx.getBeanDefinitionNames();
	// 		for (String beanName : beanNames) {
	// 			System.out.println(beanName);
	// 		}
	// 	};
	// }
	@Bean
	 CommandLineRunner printMessage(HelloWorld component) {
        return args -> {
            component.setMessage("hello component");
            component.printMessage();
        };
    }
}
