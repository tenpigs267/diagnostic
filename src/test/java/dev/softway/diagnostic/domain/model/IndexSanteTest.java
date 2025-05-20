package dev.softway.diagnostic.domain.model;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IndexSanteTest {

    @ParameterizedTest
    @ValueSource(ints = {-3, 0, 3, 6, 9, 15})
    void devrait_indiquer_probleme_cardiaque(int valeurIndexSante){
        //Given
        IndexSante indexSante = new IndexSante(valeurIndexSante);

        //When Then
        assertTrue(indexSante.indiqueProblemeCardiaque());
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 1, 2, 4, 5, 7, 8, 10})
    void ne_devrait_pas_indiquer_probleme_cardiaque(int valeurIndexSante){
        //Given
        IndexSante indexSante = new IndexSante(valeurIndexSante);

        //When Then
        assertFalse(indexSante.indiqueProblemeCardiaque());
    }

    @ParameterizedTest
    @ValueSource(ints = {-5, 0, 5, 10, 15})
    void devrait_indiquer_fracture(int valeurIndexSante){
        //Given
        IndexSante indexSante = new IndexSante(valeurIndexSante);

        //When Then
        assertTrue(indexSante.indiqueFracture());
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 1, 2, 3, 4, 6, 7, 8, 9})
    void ne_devrait_pas_indiquer_fracture(int valeurIndexSante){
        //Given
        IndexSante indexSante = new IndexSante(valeurIndexSante);

        //When Then
        assertFalse(indexSante.indiqueFracture());
    }
}
