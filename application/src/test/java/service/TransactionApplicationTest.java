package service;

import com.exaltit.kata.domain.domain.model.TransactionDomainModel;
import com.exaltit.kata.domain.port.spi.TransactionJpaPort;
import com.exaltit.kata.domain.application.service.TransactionApplicationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
class TransactionApplicationTest {

    @Mock
    private TransactionJpaPort transactionJpaPort;

    @InjectMocks
    private TransactionApplicationService transactionApplicationService;

    private TransactionDomainModel transactionDomainModel;

    @BeforeEach
    void init(){
        transactionDomainModel = new TransactionDomainModel(22l,2000l,Instant.now(),BigDecimal.valueOf(2000));
    }

    @Test
    @Disabled
    void shouldGetAllTransactions() {
       /* Mockito.when(transactionJpaPort.getAllTransactions()).thenReturn(Flux.just(transactionDomainModel));
        StepVerifier.create(transactionApplicationService.getAllTransactions())
                .assertNext(transactionResult -> {
                    assertNotNull(transactionResult);
                    assertEquals(transactionDomainModel.getRefTransaction(), transactionResult.getRefTransaction());
                    assertEquals(transactionDomainModel.getDate(), transactionResult.getDate());
                    assertEquals(transactionDomainModel.getSolde(), transactionResult.getSolde());
                })
                .verifyComplete();*/
    }
}
