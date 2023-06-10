package com.exaltit.kata.domain.adapter.rest.compte;

import com.exaltit.kata.domain.domain.model.CompteDomainModel;
import org.mapstruct.Mapper;

import static org.mapstruct.factory.Mappers.getMapper;

@Mapper(imports = CompteDomainModel.class)
public interface CompteRestMapper {

    CompteRestMapper COMPTE_REST_MAPPER = getMapper(CompteRestMapper.class);

    CompteDTO compteDomainModelToDto(CompteDomainModel compteDomainModel);

    CompteDomainModel DtotoDomainModel(CompteDTO compteDto);
}