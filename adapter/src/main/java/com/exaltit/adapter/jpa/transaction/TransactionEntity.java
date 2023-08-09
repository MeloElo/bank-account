package com.exaltit.adapter.jpa.transaction;

import com.exaltit.adapter.jpa.compte.CompteEntity;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Table(name = "transactions")
public class TransactionEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    @Column(nullable = false, name = "refTransaction")
    private Long refTransaction;

    @ManyToOne
    @JoinColumn(name="numCompte", nullable=false)
    private CompteEntity compte;

    @Column(name = "date_transaction")
    private Instant date;

    @Column(name = "solde")
    private BigDecimal solde;

}
