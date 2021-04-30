package com.william.blog.service;

import com.william.blog.po.User;

public interface UserService {

    User checkUser(String username, String password);
}