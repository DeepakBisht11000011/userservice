package com.deepweb.userservice.services.user;

import com.deepweb.userservice.daos.UserDao;
import com.deepweb.userservice.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Long id) {
        return getUserDao().getById(id);
    }

    public boolean saveUser(User user) {
        getUserDao().save(user);
        return true;
    }

    public UserDao getUserDao() {
        return this.userDao;
    }
}
