package com.bank.bank.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.bank.exception.InvalidIdException;
import com.bank.bank.model.Account;
import com.bank.bank.model.Executive;
import com.bank.bank.repository.ExecutiveRepository;

@Service
public class ExecutiveService {
@Autowired
private ExecutiveRepository executiveRepository;
	public Executive postExecutive(Executive executive) {
		// TODO Auto-generated method stub
		return executiveRepository.save(executive);
	}
	public Executive getByExecutiveId(int executiveId) throws InvalidIdException{
		// TODO Auto-generated method stub
		Optional<Executive> optional=executiveRepository.findById(executiveId);
		if(!optional.isPresent()) {
			throw new InvalidIdException("Executive Id Invalid");
		}
		return optional.get();
	}
//	public Account getByPath(String path) {
//		// TODO Auto-generated method stub
//		return executiveRepository.getByPath(path);
//	}

}
