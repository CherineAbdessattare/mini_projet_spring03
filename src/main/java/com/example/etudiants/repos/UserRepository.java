package com.example.etudiants.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.etudiants.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
