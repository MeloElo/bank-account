package com.exaltit.kata.domain.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@AllArgsConstructor
public class TransactionDomainModel {
    Long refTransaction;
    Long numCompte;
    Instant date;
    BigDecimal solde;
}
