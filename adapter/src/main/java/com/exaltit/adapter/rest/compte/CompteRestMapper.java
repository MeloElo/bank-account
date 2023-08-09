package com.exaltit.adapter.rest.compte;

import com.exaltit.domain.model.CompteDomainModel;
import org.mapstruct.Mapper;

import static org.mapstruct.factory.Mappers.getMapper;

@Mapper(imports = CompteDomainModel.class)
public interface CompteRestMapper {

    CompteRestMapper COMPTE_REST_MAPPER = getMapper(CompteRestMapper.class);

    CompteDTO compteDomainModelToDto(CompteDomainModel compteDomainModel);

}