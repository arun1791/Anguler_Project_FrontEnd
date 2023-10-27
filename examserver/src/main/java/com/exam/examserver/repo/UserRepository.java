package com.exam.examserver.repo;

import com.exam.examserver.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User , Integer> {

    public  User findByUsername(String userName);
}
