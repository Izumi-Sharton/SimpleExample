package com.example.simpleex.repos;

import com.example.simpleex.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRep extends JpaRepository {
    User findByUsername(String username);
}
