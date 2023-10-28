package com.exam.examserver;

import com.exam.examserver.entites.Role;
import com.exam.examserver.entites.User;
import com.exam.examserver.entites.UserRole;
import com.exam.examserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

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

//	@Bean
//	public CorsConfigurationSource corsConfigurationSource() {
//		CorsConfiguration configuration = new CorsConfiguration();
//		configuration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
//		configuration.setAllowCredentials(true);
//		configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS"));
//		configuration.setAllowedHeaders(Arrays.asList("Access-Control-Allow-Origin","Authorization", "Cache-Control", "Content-Type", "xsrfheadername","xsrfcookiename"
//				,"X-Requested-With","XSRF-TOKEN","Accept", "x-xsrf-token","withcredentials","x-csrftoken"));
//		configuration.setExposedHeaders(Arrays.asList("custom-header1", "custom-header2"));
//		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//		source.registerCorsConfiguration("/**", configuration);
//		return source;
//	}

//	@Bean
//	public WebMvcConfigurer corsConfigurer() {
//		return  new WebMvcConfigurer()
//		{
//			@Override
//			public void addCorsMappings(CorsRegistry registry) {
//				registry.addMapping("/**").allowedOrigins("http://localhost:4200");
////				WebMvcConfigurer.super.addCorsMappings(registry);
//			}
//		};
//	}
}
