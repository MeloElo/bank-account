package com.exaltit.adapter.jpa.transaction;

import com.exaltit.domain.model.TransactionDomainModel;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface TransactionJpaMapper {

        TransactionEntity toEntity(TransactionDomainModel transactionDomainModel);

        TransactionDomainModel toDomainModel(TransactionEntity transactionEntity);

        List<TransactionDomainModel> toDomainModelList(List<TransactionEntity> transactionDomainModelList);
}
