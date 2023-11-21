package com.bank.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bank.bank.model.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>{
    @Query("select a.id from Account a where a.type=?1")
	int getByPath(String path);

}
