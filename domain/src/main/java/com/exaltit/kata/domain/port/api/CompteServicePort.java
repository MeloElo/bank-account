package com.exaltit.kata.domain.port.api;

import com.exaltit.kata.domain.domain.model.CompteDomainModel;
import java.math.BigDecimal;


public interface CompteServicePort {

    CompteDomainModel crediterCompte(BigDecimal montant, Long numComte);
    CompteDomainModel debiterCompte(BigDecimal montant, Long numComte);
    CompteDomainModel getCompteByNumCompte(Long numCompte);
    BigDecimal getSoldeByNumCompte(Long numCompte);
}
