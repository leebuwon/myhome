package com.godcoder.myhome.repository;

import com.godcoder.myhome.model.User;

import java.util.List;

public interface CustomizedUserRepository{

    void findByUsernameCustom(User user);

//    List<User> findByUsernameJDBC(String username);
}
