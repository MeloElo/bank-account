package com.exaltit.domain.port.api;

import com.exaltit.domain.model.CompteDomainModel;

import java.math.BigDecimal;

public interface CompteJpaPort {
    CompteDomainModel saveCompte(CompteDomainModel compte);
    CompteDomainModel getCompteByNumCompte(Long numCompte);
    BigDecimal getSoldeByNumCompte(Long numCompte);
}
