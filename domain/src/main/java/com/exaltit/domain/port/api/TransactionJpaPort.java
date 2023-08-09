package com.exaltit.domain.port.api;

import com.exaltit.domain.model.TransactionDomainModel;

import java.util.List;

public interface TransactionJpaPort {

    List<TransactionDomainModel> getAllTransactions();

}
