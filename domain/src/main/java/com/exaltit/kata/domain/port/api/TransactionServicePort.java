package com.exaltit.kata.domain.port.api;

import com.exaltit.kata.domain.domain.model.TransactionDomainModel;

import java.util.List;

public interface TransactionServicePort {

    List<TransactionDomainModel> getAllTransactions();
}
