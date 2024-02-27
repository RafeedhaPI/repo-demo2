package com.example.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {


			UserEntity user1 = new UserEntity();
			user1.setId(Long.valueOf("25"));
			user1.setName("Anvar");
			user1.setPhoneNumber("356487912");
			user1.setAlternateContact("8663987412");
			userRepository.save(user1);

			UserEntity user2= new UserEntity();
			user2.setId(Long.valueOf("26"));
			user2.setName("sheza");
			user2.setPhoneNumber("367987456");
			user2.setAlternateContact("5843417898");
			userRepository.save(user2);



	}
}

