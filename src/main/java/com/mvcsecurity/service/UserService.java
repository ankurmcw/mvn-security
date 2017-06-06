package com.mvcsecurity.service;

import com.mvcsecurity.model.User;

/**
 * Created by marchatt on 6/6/2017.
 */
public interface UserService {

    public User findUserByEmail(String email);

    public void saveUser(User user);
}
