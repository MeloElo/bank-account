package com.exaltit.kata.domain.adapter.rest.compte;


import com.exaltit.kata.domain.port.api.CompteServicePort;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

import static com.exaltit.kata.domain.adapter.rest.compte.CompteRestMapper.COMPTE_REST_MAPPER;


@RestController
@RequestMapping("/api/compte")
@Validated
@RequiredArgsConstructor
public class CompteController {

    private final CompteServicePort compteServicePort;
    @Operation(summary = "récuperer le solde du compte ")
    @GetMapping("/solde")
    public BigDecimal getSoldeByNumCompte(@RequestParam Long numCompte) {
        return compteServicePort.getSoldeByNumCompte(numCompte);
    }

    @GetMapping("/")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Welcome to bank account");
    }

    @Operation(summary = "Créditer le compte ")
    @PostMapping
    public CompteDTO crediterCompteRest(@RequestParam BigDecimal montant, @RequestParam Long numCompte) {
        return COMPTE_REST_MAPPER.compteDomainModelToDto(compteServicePort.crediterCompte(montant, numCompte));
    }

    @Operation(summary = "Débiter le compte ")
    @PostMapping
    public CompteDTO debiterCompteRest(@RequestParam BigDecimal montant, @RequestParam Long numCompte) {
        return COMPTE_REST_MAPPER.compteDomainModelToDto(compteServicePort.debiterCompte(montant, numCompte));
    }

}
