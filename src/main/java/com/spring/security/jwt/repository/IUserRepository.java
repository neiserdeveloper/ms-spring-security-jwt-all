package com.spring.security.jwt.repository;

import com.spring.security.jwt.model.UserModel;

public interface IUserRepository {
 public UserModel findByName(String user);
}
