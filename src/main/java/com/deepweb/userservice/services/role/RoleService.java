package com.deepweb.userservice.services.role;

import com.deepweb.userservice.entities.Role;

import java.util.List;

public interface RoleService {
    void saveRole(Role role);
    void saveAllRoles(List<Role> roles);
}
