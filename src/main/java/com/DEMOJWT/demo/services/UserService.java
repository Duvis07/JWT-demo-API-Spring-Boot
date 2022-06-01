package com.DEMOJWT.demo.services;

import com.DEMOJWT.demo.dto.User;
import com.DEMOJWT.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserService {
    @Autowired
    private UserRepository  userRepository;

    public Flux<User> getAllUsers(){
        return userRepository.findAll();
    }

    public Mono<User> getUsers(String user, String pwd) {
        return userRepository.findByUserAndPwd(user, pwd);   }

    private User getUser(String username, String pwd) {
        User user = new User();
        user.setUser(username);
        user.getPwd(pwd);
        return user;
    }
}
