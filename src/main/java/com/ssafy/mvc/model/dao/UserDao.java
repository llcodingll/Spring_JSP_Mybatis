package com.ssafy.mvc.model.dao;

import com.ssafy.mvc.model.dto.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    void register(User user);
    User login(User user);
    User findById(Long id);
}
