package com.exaltit.kata.domain.adapter.rest.transaction;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@AllArgsConstructor
public class TransactionDTO {

    Long refTransaction;
    Long numCompte;
    Instant date;
    BigDecimal solde;

}
