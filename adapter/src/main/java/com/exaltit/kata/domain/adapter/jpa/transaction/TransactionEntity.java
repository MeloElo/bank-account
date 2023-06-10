package com.exaltit.kata.domain.adapter.jpa.transaction;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Table(name = "transaction")
public class TransactionEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    @Column(nullable = false, name = "refTransaction")
    private Long refTransaction;

    @Column(nullable = false, name = "numCompte")
    private Long numCompte;

    @Column(name = "date")
    private Instant date;

    @Column(name = "solde")
    private BigDecimal solde;

}
