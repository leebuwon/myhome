package com.godcoder.myhome.repository;

import com.godcoder.myhome.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

//jdbc 쿼리하는 법 다시한번 보기
public class CustomizedUserRepositoryImpl implements CustomizedUserRepository {
    @PersistenceContext
    private EntityManager em;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void findByUsernameCustom(User user) {

    }

//    @Override
//    public List<User> findByUsernameJDBC(String username) {
//        List<User> users = jdbcTemplate.query(
//                "SELECT * FROM USER WHERE username like %?%",
//                new Object[]
//                new BeanPropertyRowMapper(User.class));
//        return users;
//    }
}
