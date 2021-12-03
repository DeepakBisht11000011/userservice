package com.deepweb.userservice.services.user;

import com.deepweb.userservice.entities.User;

public interface UserService {
    User getUserById(Long id);
}
