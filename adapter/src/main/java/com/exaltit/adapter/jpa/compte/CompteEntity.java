package com.exaltit.adapter.jpa.compte;

import com.exaltit.adapter.jpa.transaction.TransactionEntity;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Table(name = "compte")
public class CompteEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(nullable = false, name = "numCompte")
    private Long numCompte;

    @Column(name = "solde")
    private BigDecimal solde;

    @OneToMany(mappedBy="compte")
    private List<TransactionEntity> transactions;

}
