package com.exaltit.kata.domain.adapter.rest.transaction;

import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
public class TransactionDTO {

    Long numCompte;
    Long refTransaction;
    Instant date;
    BigDecimal solde;

}
