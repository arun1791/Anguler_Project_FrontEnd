package com.exam.examserver.controller;

import com.exam.examserver.entites.Role;
import com.exam.examserver.entites.User;
import com.exam.examserver.entites.UserRole;
import com.exam.examserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/users")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/")
    public User createUser(@RequestBody User user) throws Exception {
        Set<UserRole> userRoles=new HashSet<>();
      user.setPassword(passwordEncoder.encode(user.getPassword()));
        Role role=new Role();
//        role.setRoleId(44L);
//        role.setRoleName("ADMIN");
//        Role role1=new Role();
        role.setRoleId(46L);
        role.setRoleName("NORMAL");
        UserRole userRole=new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);
//        userRole.setRole(role1);
        userRoles.add(userRole);

        return this.userService.createUser(user,userRoles);
    }
    //get user by username
    @GetMapping("/{username}")
    public  User getUser(@PathVariable("username") String username) throws Exception {
        return  this.userService.getUser(username);
    }
    //delete user
    @DeleteMapping("/{userId}")
    public void  deleteUser(@PathVariable("userId") int  userId) throws Exception {
        this.userService.deleteUser(userId);

    }

    //update user pending
}
