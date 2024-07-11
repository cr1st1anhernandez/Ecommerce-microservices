package com.example.auth_service.persistence.respositories;

import com.example.auth_service.persistence.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query(value = "SELECT * FROM USERS WHERE username = :username", nativeQuery = true)
    Optional<User> findByUsername(String username);
}

