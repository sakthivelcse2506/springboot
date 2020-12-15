package com.sakthi.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sakthi.spring.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
