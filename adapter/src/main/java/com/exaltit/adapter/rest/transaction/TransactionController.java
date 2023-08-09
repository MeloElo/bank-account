package com.exaltit.adapter.rest.transaction;

import com.exaltit.domain.port.spi.TransactionServicePort;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/transaction")
@Validated
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionServicePort transactionServicePort;
    @Operation(summary = "récuperer la liste des transactions ")
    @GetMapping("/transactions")
    public List<TransactionDTO> getTransactions() {
        return TransactionRestMapper.TRANSACTION_REST_MAPPER.transactionDomainModelToDto(transactionServicePort.getAllTransactions());
    }

}
