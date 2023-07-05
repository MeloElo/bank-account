package com.exaltit.kata.domain.port.spi;

import com.exaltit.kata.domain.domain.model.TransactionDomainModel;

import java.util.List;

public interface TransactionJpaPort {

    List<TransactionDomainModel> getAllTransactions();

}
