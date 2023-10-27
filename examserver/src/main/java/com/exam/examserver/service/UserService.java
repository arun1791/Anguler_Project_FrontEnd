package com.exam.examserver.service;

import com.exam.examserver.entites.User;
import com.exam.examserver.entites.UserRole;

import java.util.Set;

public interface UserService {
    //createing usr service
    public  User createUser(User user, Set<UserRole> userRoles) throws Exception;

    //get user by uswername
    public User getUser(String username) throws Exception;

    public  void deleteUser(int userId) throws Exception;
}
