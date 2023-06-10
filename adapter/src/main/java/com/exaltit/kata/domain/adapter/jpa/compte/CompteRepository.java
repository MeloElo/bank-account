package com.exaltit.kata.domain.adapter.jpa.compte;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.math.BigDecimal;


@Repository
public interface CompteRepository extends JpaRepository<CompteEntity, Integer> {
    BigDecimal getSoldeByNumCompte(Long numCompte);

    CompteEntity findByNumCompte(Long numCompte);
}
