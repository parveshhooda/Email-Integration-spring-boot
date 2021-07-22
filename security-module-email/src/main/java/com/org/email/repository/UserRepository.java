package com.org.email.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.email.model.User;







@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    
    List<User> findByEmail(String email);
    
    

}