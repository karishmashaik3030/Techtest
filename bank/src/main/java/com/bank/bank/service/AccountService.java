package com.bank.bank.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.bank.exception.InvalidIdException;
import com.bank.bank.model.Account;
import com.bank.bank.model.AccountHolder;
import com.bank.bank.repository.AccountRepository;

@Service
public class AccountService {
@Autowired
private AccountRepository accountRepository;
	public Account postAccount(Account account) {
		// TODO Auto-generated method stub
		return accountRepository.save(account);
	}
	public Account getByAccountId(int accountId) throws InvalidIdException{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Optional<Account> optional=accountRepository.findById(accountId);
				if(!optional.isPresent()) {
					throw new InvalidIdException("Account Id Invalid");
				}
				return optional.get();
	}
	public int getByPath(String path) {
		// TODO Auto-generated method stub
		return accountRepository.getByPath(path);
	}

}
