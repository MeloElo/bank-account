package com.exaltit.domain.port.spi;

import com.exaltit.domain.model.CompteDomainModel;

import java.math.BigDecimal;


public interface CompteServicePort {

    CompteDomainModel crediterCompte(BigDecimal montant, Long numComte);
    CompteDomainModel debiterCompte(BigDecimal montant, Long numComte);
    CompteDomainModel getCompteByNumCompte(Long numCompte);
    BigDecimal getSoldeByNumCompte(Long numCompte);
}
