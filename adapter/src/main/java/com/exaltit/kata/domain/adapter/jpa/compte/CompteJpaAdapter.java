package com.exaltit.kata.domain.adapter.jpa.compte;

import com.exaltit.kata.domain.domain.model.CompteDomainModel;
import com.exaltit.kata.domain.port.spi.CompteJpaPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;

@Component
@RequiredArgsConstructor
public class CompteJpaAdapter implements CompteJpaPort {

    private final CompteRepository compteRepository;

    @Override
    public CompteDomainModel saveCompte(CompteDomainModel compte) {
        return CompteJpaMapper.COMPTE_JPA_MAPPER.toDomainModel(compteRepository.save(CompteJpaMapper.COMPTE_JPA_MAPPER.toEntity(compte)));
    }

    @Override
    public CompteDomainModel getCompteByNumCompte(Long numCompte) {
        return CompteJpaMapper.COMPTE_JPA_MAPPER.toDomainModel(compteRepository.findByNumCompte(numCompte));
    }

    @Override
    public BigDecimal getSoldeByNumCompte(Long numCompte) {
        return compteRepository.findByNumCompte(numCompte).getSolde();
    }
}
