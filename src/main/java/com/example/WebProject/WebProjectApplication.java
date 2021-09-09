package com.example.WebProject;

import com.example.WebProject.domain.User;
import com.example.WebProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(WebProjectApplication.class, args);
	}
	@Autowired
	UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception{
		this.userRepository.save(new User("WR", "Jang", "wrjang@naver.com","010-NULL"));
		this.userRepository.save(new User("Pitchu", "Jung", "NULL","010-NULL"));
	}

}
