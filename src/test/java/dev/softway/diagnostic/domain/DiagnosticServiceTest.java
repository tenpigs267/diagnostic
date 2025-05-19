package dev.softway.diagnostic.domain;

import dev.softway.diagnostic.domain.model.UniteMedicale;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static dev.softway.diagnostic.domain.model.UniteMedicale.CARDIOLOGIE;
import static org.junit.jupiter.api.Assertions.*;

class DiagnosticServiceTest {
    @ParameterizedTest
    @ValueSource(ints = {0, 3, 6, 9, 15, 33})
    void devrait_rediriger_vers_cardiologie(int valeurIndexSante){
        //Given
        DiagnosticService diagnosticService = new DiagnosticService();

        //When
        List<UniteMedicale> uniteMedicales = diagnosticService.redirigeVersUniteMedicale(valeurIndexSante);

        // Then
        assertTrue(uniteMedicales.contains(CARDIOLOGIE));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 5, 7, 8, 10, 55})
    void ne_devrait_pas_rediriger_vers_cardiologie(int valeurIndexSante){
        //Given
        DiagnosticService diagnosticService = new DiagnosticService();

        //When
        List<UniteMedicale> uniteMedicales = diagnosticService.redirigeVersUniteMedicale(valeurIndexSante);

        // Then
        assertFalse(uniteMedicales.contains(CARDIOLOGIE));
    }


}
