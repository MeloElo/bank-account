package service;

import com.exaltit.kata.domain.domain.model.CompteDomainModel;
import com.exaltit.kata.domain.port.spi.CompteJpaPort;
import com.exaltit.kata.domain.application.service.CompteApplicationService;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.math.BigDecimal;
import static org.assertj.core.api.Assertions.assertThat;


@ExtendWith(MockitoExtension.class)
class CompteApplicationTest {
    @Mock
    private CompteJpaPort compteJpaPort;

    @InjectMocks
    private CompteApplicationService compteApplicationService;

    private CompteDomainModel compteDomainModel;

    @BeforeEach
    void init(){
        compteDomainModel = CompteDomainModel.builder()
                .solde(BigDecimal.valueOf(10000))
                .refTransaction(92852l)
                .numCompte(2002l)
                .build();
    }

    @Test
    @DisplayName("Should crediter compte")
    void shouldCrediterCompte() {
        Mockito.when(compteJpaPort.getCompteByNumCompte(Mockito.anyLong()))
                .thenReturn(compteDomainModel);
        Mockito.lenient().when(compteJpaPort.saveCompte(Mockito.any()))
            .thenReturn(compteDomainModel);
        CompteDomainModel compte = compteApplicationService.crediterCompte(BigDecimal.valueOf(2000), 200l);
        assertThat(compte.getSolde()).isEqualTo(BigDecimal.valueOf(12000));
    }

    @Test
    @DisplayName("Should debiter compte")
    void shouldDebiterCompte() {
        Mockito.when(compteJpaPort.getCompteByNumCompte(Mockito.anyLong()))
                .thenReturn(compteDomainModel);
        Mockito.lenient().when(compteJpaPort.saveCompte(Mockito.any()))
                .thenReturn(compteDomainModel);
        CompteDomainModel compte = compteApplicationService.debiterCompte(BigDecimal.valueOf(2000),99l);
        assertThat(compte.getSolde()).isEqualTo(BigDecimal.valueOf(8000));
    }

    @Test
    @DisplayName("Should get solde")
    void shouldGetSolde() {

        BigDecimal solde = BigDecimal.valueOf(10000);
        Mockito.when(compteJpaPort.getSoldeByNumCompte(Mockito.anyLong()))
                .thenReturn(solde);

        BigDecimal soldeResult = compteApplicationService.getSoldeByNumCompte(200l);
        assertThat(soldeResult).isEqualTo(solde);
    }
}
