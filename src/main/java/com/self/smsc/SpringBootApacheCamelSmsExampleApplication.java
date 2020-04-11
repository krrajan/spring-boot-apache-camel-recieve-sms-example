package com.self.smsc;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.self.smsc")
@Configurable
public class SpringBootApacheCamelSmsExampleApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApacheCamelSmsExampleApplication.class, args);
	}

}
