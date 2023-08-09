package com.exaltit.adapter.jpa.transaction;

import com.exaltit.domain.model.TransactionDomainModel;
import com.exaltit.domain.port.api.TransactionJpaPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class TransactionJpaAdapter implements TransactionJpaPort {

    private final TransactionRepository transactionRepository;

    private final TransactionJpaMapper TRANSACTION_JPA_MAPPER;

    @Override
    public List<TransactionDomainModel> getAllTransactions() {
        return TRANSACTION_JPA_MAPPER.toDomainModelList(transactionRepository.findAll());
    }
}
