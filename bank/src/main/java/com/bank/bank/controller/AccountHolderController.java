package com.bank.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.bank.bank.exception.InvalidIdException;
import com.bank.bank.model.AccountHolder;

import com.bank.bank.service.AccountDetailsService;
import com.bank.bank.service.AccountHolderService;
import com.bank.bank.service.ExecutiveService;


@RestController
@RequestMapping("/holder")
public class AccountHolderController {
@Autowired
private AccountHolderService accountHolderService;
@Autowired
private ExecutiveService executiveService;
@Autowired
private AccountDetailsService accountDetailsService;
@PostMapping("/add")
public AccountHolder postHolder(@RequestBody AccountHolder accountHolder) {
	accountHolder=accountHolderService.postHolder(accountHolder);
	return accountHolder;
}
//@GetMapping("/getAll/{eid}")
//public ResponseEntity<?> getAllHolders(@PathVariable("eid") int eid) {
//	
//	try {
//		//validate vendorId
//		Executive executive=executiveService.getByExecutiveId(eid);
//		List<AccountHolder> list=accountHolderService.getAllHolders(eid);
//		return ResponseEntity.ok().body(list);
//	} catch (InvalidIdException e) {
//		// TODO Auto-generated catch block
//		return ResponseEntity.badRequest().body(e.getMessage());
//	}
//}
}
