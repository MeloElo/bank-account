package com.exaltit.adapter.jpa.compte;

import com.exaltit.domain.model.CompteDomainModel;
import com.exaltit.domain.port.api.CompteJpaPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;

@Component
@RequiredArgsConstructor
public class CompteJpaAdapter implements CompteJpaPort {

    private final CompteRepository compteRepository;
    private final CompteJpaMapper COMPTE_JPA_MAPPER;

    @Override
    public CompteDomainModel saveCompte(CompteDomainModel compte) {
        return COMPTE_JPA_MAPPER.toDomainModel(compteRepository.save(COMPTE_JPA_MAPPER.toEntity(compte)));
    }

    @Override
    public CompteDomainModel getCompteByNumCompte(Long numCompte) {
        return COMPTE_JPA_MAPPER.toDomainModel(compteRepository.findByNumCompte(numCompte));
    }

    @Override
    public BigDecimal getSoldeByNumCompte(Long numCompte) {
        return compteRepository.findByNumCompte(numCompte).getSolde();
    }
}
