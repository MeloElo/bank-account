package com.exaltit.kata.domain.adapter.rest.transaction;

import com.exaltit.kata.domain.domain.model.TransactionDomainModel;
import org.mapstruct.Mapper;

import java.util.List;

import static org.mapstruct.factory.Mappers.getMapper;


@Mapper(imports = TransactionDomainModel.class)
public interface TransactionRestMapper {

    TransactionRestMapper TRANSACTION_REST_MAPPER = getMapper(TransactionRestMapper.class);

    List<TransactionDTO> transactionDomainModelToDto(List<TransactionDomainModel> transactionDomainModel);

    TransactionDomainModel DtotoDomainModel(TransactionDTO transactionDto);
}
