package com.exaltit.application.service;

import com.exaltit.domain.model.CompteDomainModel;
import com.exaltit.domain.port.spi.CompteServicePort;
import com.exaltit.domain.port.api.CompteJpaPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class CompteApplicationService implements CompteServicePort {

    private final CompteJpaPort compteJpaPort;


    @Override
    @Transactional
    public CompteDomainModel crediterCompte(BigDecimal montant, Long numCompte) {
        var compte = getCompteByNumCompte(numCompte);
        compte.setSolde(compte.getSolde().add(montant));
        compteJpaPort.saveCompte(compte);
        return compte;
    }

    @Override
    @Transactional
    public CompteDomainModel debiterCompte(BigDecimal montant, Long numCompte) {
        CompteDomainModel compte = getCompteByNumCompte(numCompte);
        if (compte.getSolde().intValueExact() < montant.intValueExact()) {
            throw new IllegalArgumentException("solde insuffisant");
        }
        compte.setSolde(compte.getSolde().subtract(montant));
        compteJpaPort.saveCompte(compte);
        return compte;
    }

    @Override
    public CompteDomainModel getCompteByNumCompte(Long numCompte) {
        return compteJpaPort.getCompteByNumCompte(numCompte);
    }

    @Override
    public BigDecimal getSoldeByNumCompte(Long numCompte) {
        return compteJpaPort.getSoldeByNumCompte(numCompte);
    }
}
