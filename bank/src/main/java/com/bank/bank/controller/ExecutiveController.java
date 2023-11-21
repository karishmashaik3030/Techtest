package com.bank.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.bank.model.Executive;
import com.bank.bank.model.User;
import com.bank.bank.service.ExecutiveService;
import com.bank.bank.service.UserService;

@RestController
@RequestMapping("/executive")
public class ExecutiveController {
@Autowired
private UserService userService;
@Autowired
private ExecutiveService executiveService;
@PostMapping("/add")
public Executive postExecutive(@RequestBody Executive executive) {
	User user=executive.getUser();
	//save user in db
	user=userService.insertUser(user);
	//attach saved user to vendor
	executive.setUser(user);
	//save vendor in db
	executive=executiveService.postExecutive(executive);
	return executive;
}
}
