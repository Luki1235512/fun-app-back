package com.example.funappback.login;

import lombok.Data;

@Data
public class UserDto {
    private long id;
    private String login;

    public UserDto(Long id, String login) {
        this.id = id;
        this.login = login;
    }
}
