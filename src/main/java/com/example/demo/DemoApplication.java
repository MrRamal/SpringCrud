package com.example.demo;

import com.example.demo.model.Student;
import com.example.demo.config.AppConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@RequiredArgsConstructor
@SpringBootApplication
public class DemoApplication implements CommandLineRunner {


	public final Student student;
	public final AppConfig appConfig;



	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		System.out.println(appConfig);

	}
}
