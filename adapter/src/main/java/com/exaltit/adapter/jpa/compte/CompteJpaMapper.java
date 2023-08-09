package com.exaltit.adapter.jpa.compte;

import com.exaltit.domain.model.CompteDomainModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface CompteJpaMapper {

    @Mapping(target = "id", source = "id")
    CompteEntity toEntity(CompteDomainModel compteDomainModel);

    CompteDomainModel toDomainModel(CompteEntity compteEntity);

    CompteDomainModel toDomainModelList(CompteEntity compteDomainModelList);
}

