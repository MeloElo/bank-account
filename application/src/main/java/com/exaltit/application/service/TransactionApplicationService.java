package com.exaltit.application.service;

import com.exaltit.domain.model.TransactionDomainModel;
import com.exaltit.domain.port.spi.TransactionServicePort;
import com.exaltit.domain.port.api.TransactionJpaPort;
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
