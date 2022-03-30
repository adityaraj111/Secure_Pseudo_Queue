package com.natwest.fakequeue.service;

import java.io.IOException;
import java.io.Serializable;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SealedObject;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.natwest.fakequeue.aes.AES;
import com.natwest.fakequeue.bean.Transaction;
import com.natwest.fakequeue.dao.TransactionDAO;
import com.natwest.fakequeue.entity.TransactionEntity;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Service
public class TransactionServiceImpl {
	
	@Autowired
	private TransactionDAO transactionDAO;
	

	
	private static SecretKey mykey;
	
	String secretKey = "0123456789abcdef0123456789abcdef";
	
	public Integer senderTransaction(Transaction transaction)  throws Exception{
		// Encrption starts	
		String transactionText = transaction.toString();
		String encryptedString = AES.encrypt(transactionText, secretKey) ;
	    // Encryption ends
	    final String uri = "http://localhost:8080/transaction/receiver";

	    RestTemplate restTemplate = new RestTemplate();
	    HttpEntity<String> request = new HttpEntity<>(encryptedString);
	    Integer result = restTemplate.postForObject(uri, request, Integer.class);
		return result;
	}
	
	
	

	

}
