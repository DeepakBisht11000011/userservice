package com.deepweb.userservice.services.role;

import com.deepweb.userservice.daos.RoleDao;
import com.deepweb.userservice.entities.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;

    @Override
    public void saveRole(Role role) {
        getRoleDao().save(role);
    }

    @Override
    public void saveAllRoles(List<Role> roles) {
        getRoleDao().saveAll(roles);
    }

    public RoleDao getRoleDao() {
        return this.roleDao;
    }
}
