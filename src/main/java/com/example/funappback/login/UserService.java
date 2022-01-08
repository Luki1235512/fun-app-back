package com.example.funappback.login;

import org.springframework.stereotype.Service;

import java.util.Optional;

public interface UserService {

    Optional<User> findById(Long id);
    User save(User user);
    Iterable<User> findAll();
}


