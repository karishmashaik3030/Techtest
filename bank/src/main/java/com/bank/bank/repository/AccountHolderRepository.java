package com.bank.bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.bank.model.AccountHolder;

public interface AccountHolderRepository extends JpaRepository<AccountHolder, Integer>{

//	List<AccountHolder> findByExecutiveId(int eid);


}
