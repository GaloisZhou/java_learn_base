package com.galoiszhou.springclould.dao;

import com.galoiszhou.springclould.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
