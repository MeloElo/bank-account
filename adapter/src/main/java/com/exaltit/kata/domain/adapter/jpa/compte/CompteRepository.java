package com.exaltit.kata.domain.adapter.jpa.compte;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CompteRepository extends JpaRepository<CompteEntity, Integer> {
    CompteEntity findByNumCompte(Long numCompte);
}
