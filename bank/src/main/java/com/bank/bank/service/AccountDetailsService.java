package com.bank.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.bank.model.AccountDetails;
import com.bank.bank.model.AccountHolder;
import com.bank.bank.repository.AccountDetailsRepository;

@Service
public class AccountDetailsService {
@Autowired
private AccountDetailsRepository accountDetailsRepository;
	public AccountDetails postDetails(AccountDetails accountDetails) {
		// TODO Auto-generated method stub
		return accountDetailsRepository.save(accountDetails);
	}
	public List<AccountHolder> getAllHolders(int eid) {
		// TODO Auto-generated method stub
		return accountDetailsRepository.findByExecutiveId(eid);
	}
	public AccountDetails getByAccountId(int accountholderId) {
		// TODO Auto-generated method stub
		return accountDetailsRepository.findByAccountHolderId(accountholderId);
	}
	public List<Integer> getHolderId(int eid) {
		// TODO Auto-generated method stub
		return accountDetailsRepository.getHolderId(eid);
	}

}
