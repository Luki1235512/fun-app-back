package com.example.funappback.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.funappback.user.model.User;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {

    void deleteUserById(Long id);
    Optional<User> findUserById(Long id);
}
