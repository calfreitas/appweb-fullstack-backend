package com.codewithcalliel.fullstackbackend.repository;

import com.codewithcalliel.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
