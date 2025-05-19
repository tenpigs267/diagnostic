package dev.softway.diagnostic.domain.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class IndexSanteTest {

    @Test
    void devrait_identifier_probleme_cardiaque(){
        //Given
        IndexSante indexSante = new IndexSante(3);

        //When Then
        assertTrue(indexSante.problemeCardiaque());
    }
}
