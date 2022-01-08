package com.example.funappback.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(value = "/api/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public Collection<UserDto> findAll() {
        Iterable<User> users = this.userService.findAll();
        List<UserDto> userDtos = new ArrayList<>();
        users.forEach(p -> userDtos.add(convertToDto(p)));;
        return userDtos;
    }

    protected UserDto convertToDto(User entity) {
        UserDto dto = new UserDto(entity.getId(), entity.getLogin());

        return dto;
    }

}
