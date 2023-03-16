package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		helloWorld.sayHello();
		// Utilisez le chemin d'accès absolu ou relatif au fichier de configuration XML
		ApplicationContext context2 = new FileSystemXmlApplicationContext("src/main/resources/beans.xml");
		HelloWorld helloWorld2 = (HelloWorld) context2.getBean("helloWorld");
		helloWorld2.sayHello();
	}

}
