package com.exaltit.kata.domain.domain.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class CompteDomainModel {

    BigDecimal solde;
    Long refTransaction;
    Long numCompte;
}
