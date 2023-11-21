package com.bank.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.bank.dto.UpdateDto;

import com.bank.bank.model.Account;
import com.bank.bank.model.AccountDetails;
import com.bank.bank.service.AccountDetailsService;
import com.bank.bank.service.AccountHolderService;
import com.bank.bank.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {
	@Autowired
	private AccountService accountService;
	@Autowired
	private AccountHolderService accountHolderService;
	@Autowired
	private AccountDetailsService accountDetailsService;
	@PostMapping("/add")
	public Account postAccount(@RequestBody Account account) {
		account=accountService.postAccount(account);
		return account;
	}
//	@PutMapping("/updateAccount")
//	public ResponseEntity<?> updateVendor(@RequestBody UpdateDto updateDto) {
//		try {
//			AccountDetails accountDetails=accountDetailsService.getByAccountId(updateDto.getAccountholderId());
//			Account account=new Account();
//			if(updateDto.getBalance()!=null)
//				account.setBalance(updateDto.getBalance());;
//			
//			account=accountService.postAccount(account);
//			//returning
//			return ResponseEntity.ok().body(account);
//		} catch (InvalidIdException e) {
//			// TODO Auto-generated catch block
//			return ResponseEntity.badRequest().body(e.getMessage());
//		}
//	} 
//	@PutMapping("/updateAccount")
//	public ResponseEntity<?> updateVendor(@RequestBody UpdateDto updateDto) {
//		try {
//			AccountDetails accountDetails=accountDetailsService.getByAccountId(updateDto.getAccountholderId());
//			Account account=new Account();
//			if(updateDto.getBalance()!=null)
//				account.setBalance(updateDto.getBalance());;
//			
//			account=accountService.postAccount(account);
//			//returning
//			return ResponseEntity.ok().body(account);
//		} catch (InvalidIdException e) {
//			// TODO Auto-generated catch block
//			return ResponseEntity.badRequest().body(e.getMessage());
//		}
//	} 
}
