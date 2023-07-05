package com.exaltit.kata.domain.application.service;

import com.exaltit.kata.domain.domain.model.TransactionDomainModel;
import com.exaltit.kata.domain.port.api.TransactionServicePort;
import com.exaltit.kata.domain.port.spi.TransactionJpaPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionApplicationService implements TransactionServicePort {

    private final TransactionJpaPort transactionJpaPort;
    @Override
    public List<TransactionDomainModel> getAllTransactions() {
         return transactionJpaPort.getAllTransactions();
    }
}
