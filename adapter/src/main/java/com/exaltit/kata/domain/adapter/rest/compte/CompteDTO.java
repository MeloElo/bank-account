package com.exaltit.kata.domain.adapter.rest.compte;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CompteDTO {
    BigDecimal solde;
    Long refTransaction;
    Long NumClient;

}
