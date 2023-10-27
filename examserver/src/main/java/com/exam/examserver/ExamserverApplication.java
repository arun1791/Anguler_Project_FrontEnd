package com.exam.examserver;

import com.exam.examserver.entites.Role;
import com.exam.examserver.entites.User;
import com.exam.examserver.entites.UserRole;
import com.exam.examserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class ExamserverApplication {
//	 implements CommandLineRunner
//	@Autowired
//	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println("straing code ...");
//		User user = new User();
//		user.setFirstName("Arun");
//		user.setLastName("Pal");
//		user.setUsername("arun8896");
//		user.setPassword("1235678");
//		user.setEmail("arun@gmail.com");
//		user.setProfile("defult.png");
//
//		Role role=new Role();
//		role.setRoleId(44L);
//		role.setRoleName("ADMIN");
//
//
//		Set<UserRole> userRoleSet=new HashSet<UserRole>();
//		UserRole userRole=new UserRole();
//		userRole.setRole(role);
//		userRole.setUser(user);
//		userRoleSet.add(userRole);
//
//		User user1 = this.userService.createUser(user, userRoleSet);
//		System.out.println(user1.getUsername());

//	}
}
