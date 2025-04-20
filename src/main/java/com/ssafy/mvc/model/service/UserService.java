package com.ssafy.mvc.model.service;

import com.ssafy.mvc.model.dao.UserDao;
import com.ssafy.mvc.model.dto.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserDao userDao;

    public UserService(UserDao userMapper) {
        this.userDao = userMapper;
    }

    public void register(User user) {
        userDao.register(user);
    }

    public User login(User user) {
        return userDao.login(user);
    }

    public User findById(Long id) {
        return userDao.findById(id);
    }
}
