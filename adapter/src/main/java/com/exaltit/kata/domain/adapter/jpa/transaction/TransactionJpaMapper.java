package com.exaltit.kata.domain.adapter.jpa.transaction;

import com.exaltit.kata.domain.domain.model.TransactionDomainModel;
import org.mapstruct.Mapper;

import java.util.List;

import static org.mapstruct.factory.Mappers.getMapper;

@Mapper()
public interface TransactionJpaMapper {

        TransactionJpaMapper TRANSACTION_JPA_MAPPER = getMapper(TransactionJpaMapper.class);

        TransactionEntity toEntity(TransactionDomainModel transactionDomainModel);

        TransactionDomainModel toDomainModel(TransactionEntity transactionEntity);

        List<TransactionDomainModel> toDomainModelList(List<TransactionEntity> transactionDomainModelList);
}
