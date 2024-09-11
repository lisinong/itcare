package com.alexli.cstraining.service;


import com.alexli.cstraining.model.User;

import java.util.List;


public interface UserService {

     List<User> findAll();
     User findByuserId(String userId);
//    void delete(List<Integer> idList);
//    User queryById(Integer id);
//    User save(User user);
//    User findByUsername(String username);
}
