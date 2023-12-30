package com.spring.security.jwt.dto;

import lombok.Data;

@Data
public class AuthRequestDto {
    String user;
    String password;
}
