package com.exaltit.kata.domain.adapter.jpa.transaction;

import com.exaltit.kata.domain.domain.model.TransactionDomainModel;
import com.exaltit.kata.domain.port.spi.TransactionJpaPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class TransactionJpaAdapter implements TransactionJpaPort {

    private final TransactionRepository transactionRepository;
    @Override
    public List<TransactionDomainModel> getAllTransactions() {
        return TransactionJpaMapper.TRANSACTION_JPA_MAPPER.toDomainModelList(transactionRepository.findAll());
    }
}
