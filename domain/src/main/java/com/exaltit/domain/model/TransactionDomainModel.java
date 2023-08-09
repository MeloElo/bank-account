package com.exaltit.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@AllArgsConstructor
@Builder
public class TransactionDomainModel {
    Long refTransaction;
    Long numCompte;
    Instant date;
    BigDecimal solde;
}
