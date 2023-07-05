package com.exaltit.kata.domain.adapter.rest.compte;


import com.exaltit.kata.domain.port.api.CompteServicePort;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@OpenAPIDefinition(tags = {@Tag(name = "CompteController")})
public class CompteController {

    private final CompteServicePort compteServicePort;

    @GetMapping("/solde")
    @Operation(
            summary = "recuperer le solde",
            description = "Service de recuperation de solde d'un compte")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Succès"),
            @ApiResponse(responseCode = "500", description = "Erreur", content = @Content)
    })
    public BigDecimal getSoldeByNumCompte(@RequestParam Long numCompte) {
        return compteServicePort.getSoldeByNumCompte(numCompte);
    }

    @GetMapping("/")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Welcome to bank account");
    }

    @Operation(summary = "Créditer le compte ")
    @PostMapping("/crediter-compte")
    public CompteDTO crediterCompteRest(@RequestParam BigDecimal montant, @RequestParam Long numCompte) {
        return COMPTE_REST_MAPPER.compteDomainModelToDto(compteServicePort.crediterCompte(montant, numCompte));
    }

    @Operation(summary = "Débiter le compte ")
    @PostMapping("/debiter-compte")
    public CompteDTO debiterCompteRest(@RequestParam BigDecimal montant, @RequestParam Long numCompte) {
        return COMPTE_REST_MAPPER.compteDomainModelToDto(compteServicePort.debiterCompte(montant, numCompte));
    }

}
