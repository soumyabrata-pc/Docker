package com.sbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class TestKafka1Application {

	public static void main(String[] args) {
		SpringApplication.run(TestKafka1Application.class, args);
	}

}
