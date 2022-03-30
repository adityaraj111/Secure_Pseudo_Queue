package com.natwest.fakequeue.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.natwest.fakequeue.entity.TransactionEntity;

@Repository
public interface TransactionDAO extends JpaRepository<TransactionEntity, Integer> {

}
