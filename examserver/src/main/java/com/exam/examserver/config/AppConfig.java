package com.exam.examserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class AppConfig {

    //    @Bean
//    public UserDetailsService userDetailsService() {
//        UserDetails username = User.builder().username("arun").password(passwordEncoder().encode("arun")).roles("ADMIN").build();
//        UserDetails user1 = User.builder().username("neha").password(passwordEncoder().encode("neha")).roles("PUBLIC").build();
//        return new InMemoryUserDetailsManager(username,user1);
//    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
        return configuration.getAuthenticationManager();
    }
}