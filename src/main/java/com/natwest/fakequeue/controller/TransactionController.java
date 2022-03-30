package com.natwest.fakequeue.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.natwest.fakequeue.bean.Transaction;
import com.natwest.fakequeue.service.TransactionServiceImpl;

@RestController
public class TransactionController {
	
	@Autowired
	private TransactionServiceImpl transactionService;
	
	
	
	@RequestMapping(value = "transaction/sender", method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> senderTransaction(@RequestBody Transaction transaction) throws Exception{
	
		Integer acc = transactionService.senderTransaction(transaction);
		String res = acc.toString();
		return new ResponseEntity<String>("Data added sucessfully for transactionId: "+res, HttpStatus.OK);
		
	}
	
	
}
