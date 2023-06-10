package com.exaltit.kata.domain.adapter.jpa.compte;

import com.exaltit.kata.domain.domain.model.CompteDomainModel;
import org.mapstruct.Mapper;

import static org.mapstruct.factory.Mappers.getMapper;

@Mapper()
public interface CompteJpaMapper {

    CompteJpaMapper COMPTE_JPA_MAPPER = getMapper(CompteJpaMapper.class);

    CompteEntity toEntity(CompteDomainModel compteDomainModel);

    CompteDomainModel toDomainModel(CompteEntity compteEntity);

    CompteDomainModel toDomainModelList(CompteEntity compteDomainModelList);
}

