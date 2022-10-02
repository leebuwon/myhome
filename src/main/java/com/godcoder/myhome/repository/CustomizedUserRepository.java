package com.godcoder.myhome.repository;

import com.godcoder.myhome.model.User;

import java.util.List;

//jdbc 쿼리하는 법 다시한번 보기
public interface CustomizedUserRepository{

    void findByUsernameCustom(User user);

//    List<User> findByUsernameJDBC(String username);
}
