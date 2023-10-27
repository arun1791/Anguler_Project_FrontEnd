package com.exam.examserver.service.impl;

import com.exam.examserver.entites.User;
import com.exam.examserver.entites.UserRole;


import com.exam.examserver.repo.RoleRepository;
import com.exam.examserver.repo.UserRepository;
import com.exam.examserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiseimpl  implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

//    @Autowired
//    private GlobalHandlerExaception globalHandlerExaception;
    //createing user
    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {
        User local=this.userRepository.findByUsername(user.getUsername());
                    if (local != null) {
                        System.out.println("user already therir ");
                        throw new UsernameNotFoundException("User already therir "+user.getUsername());

                    } else {
                        for (UserRole role : userRoles) {
                            roleRepository.save(role.getRole());
                        }
                        user.getUserRoles().addAll(userRoles);
                        local = this.userRepository.save(user);

                    }

        return local;
    }

    //geting user by username
    @Override
    public User getUser(String username) throws Exception {
        return this.userRepository.findByUsername(username);
    }

    @Override
    public void deleteUser(int userId) throws Exception {
        this.userRepository.deleteById(userId);
    }
}
