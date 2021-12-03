package com.deepweb.userservice.daos;

import com.deepweb.userservice.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role,Long> {
}
