package com.example.demo;

import com.example.demo.libraries.Holder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static Holder holder;

	public static void main(String[] args) {

		holder = new Holder();
		holder.set("a", "b", 100000);
		holder.set("c", "d", 100000);

		SpringApplication.run(DemoApplication.class, args);
	}
}
