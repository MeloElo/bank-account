package com.exaltit.domain.port.spi;

import com.exaltit.domain.model.TransactionDomainModel;

import java.util.List;

public interface TransactionServicePort {

    List<TransactionDomainModel> getAllTransactions();
}
