package com.ilopezluna.services;

import com.ilopezluna.entities.User;
import org.apache.tapestry5.ioc.annotations.Inject;

public class UserServiceImpl implements UserService {

    @Inject
    private UserDAO userDAO;

    public void create(User user) {
        userDAO.save(user);
    }
}
