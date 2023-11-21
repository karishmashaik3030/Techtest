package com.bank.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.bank.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
