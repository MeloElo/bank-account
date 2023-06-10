package com.exaltit.kata.domain.adapter.jpa.compte;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Table(name = "compte")
public class CompteEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    @Column(nullable = false, name = "numCompte")
    private Long numCompte;

    @Column(name = "solde")
    private BigDecimal solde;

    @Column(name = "refTransaction")
    private Instant refTransaction;

}
