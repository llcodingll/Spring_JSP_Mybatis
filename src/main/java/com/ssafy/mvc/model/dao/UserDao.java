package com.ssafy.mvc.model.dao;

import com.ssafy.mvc.model.dto.User;

public interface UserDao {
    void register(User user);
    User login(User user);
    User findById(Long id);
}
