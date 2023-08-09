package com.exaltit.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class CompteDomainModel {

    Long id;
    BigDecimal solde;
    List<TransactionDomainModel> transactions;
    Long numCompte;
}
