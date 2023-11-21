package com.bank.bank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bank.bank.exception.InvalidIdException;
import com.bank.bank.model.AccountHolder;
import com.bank.bank.model.Executive;
import com.bank.bank.repository.AccountHolderRepository;

@Service
public class AccountHolderService {
@Autowired
private AccountHolderRepository accountHolderRepository;
	public AccountHolder postHolder(AccountHolder accountHolder) {
		// TODO Auto-generated method stub
		return accountHolderRepository.save(accountHolder);
	}
	public AccountHolder getByAccountId(int id) throws InvalidIdException{
		// TODO Auto-generated method stub
		Optional<AccountHolder> optional=accountHolderRepository.findById(id);
		if(!optional.isPresent()) {
			throw new InvalidIdException("Account Holder Id Invalid");
		}
		return optional.get();
	}
//	public List<AccountHolder> getAllHolders(int eid) {
//		// TODO Auto-generated method stub
//		return accountHolderRepository.findByExecutiveId(eid);
//	}
//	public List<AccountHolder> getAllHolders(int id) {
//		// TODO Auto-generated method stub
//		return accountHolderRepository.findById(id); 
//	}

}
