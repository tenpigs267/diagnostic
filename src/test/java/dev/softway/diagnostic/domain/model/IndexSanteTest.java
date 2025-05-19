package dev.softway.diagnostic.domain.model;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IndexSanteTest {

    @ParameterizedTest
    @ValueSource(ints = {0, 3, 6, 9, 15})
    void devrait_identifier_probleme_cardiaque(int valeurIndexSante){
        //Given
        IndexSante indexSante = new IndexSante(valeurIndexSante);

        //When Then
        assertTrue(indexSante.problemeCardiaque());
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 5, 7, 8, 10})
    void ne_devrait_pas_identifier_probleme_cardiaque(int valeurIndexSante){
        //Given
        IndexSante indexSante = new IndexSante(valeurIndexSante);

        //When Then
        assertFalse(indexSante.problemeCardiaque());
    }
}
