package com.DEMOJWT.demo.services;

import com.DEMOJWT.demo.dto.User;
import com.DEMOJWT.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class UserService {
    @Autowired

    private UserRepository  userRepository;
    public Flux<User> obtenerUsuario;
}
