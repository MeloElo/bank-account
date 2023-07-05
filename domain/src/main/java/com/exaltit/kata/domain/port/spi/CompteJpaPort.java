package com.exaltit.kata.domain.port.spi;

import com.exaltit.kata.domain.domain.model.CompteDomainModel;
import java.math.BigDecimal;

public interface CompteJpaPort {
    CompteDomainModel saveCompte(CompteDomainModel compte);
    CompteDomainModel getCompteByNumCompte(Long numCompte);
    BigDecimal getSoldeByNumCompte(Long numCompte);
}
