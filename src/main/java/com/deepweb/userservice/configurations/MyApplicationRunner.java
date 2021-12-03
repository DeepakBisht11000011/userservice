package com.deepweb.userservice.configurations;

import com.deepweb.userservice.entities.Role;
import com.deepweb.userservice.entities.User;
import com.deepweb.userservice.services.role.RoleService;
import com.deepweb.userservice.services.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class MyApplicationRunner implements ApplicationRunner {
    private static final Logger LOG = LoggerFactory.getLogger(MyApplicationRunner.class);
    @Autowired
    private RoleService roleService;
    @Override
    public void run(ApplicationArguments args){
        Role role = Role.builder().roleName("admin").build();
        Role role1 = Role.builder().roleName("customer").build();
        Role role2 = Role.builder().roleName("student").build();
        Role role3 = Role.builder().roleName("teacher").build();
        List<Role> roles = Arrays.asList(role,role1,role2,role3);
        getRoleService().saveAllRoles(roles);
    }

    public RoleService getRoleService() {
        return this.roleService;
    }
}
