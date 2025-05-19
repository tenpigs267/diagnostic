package dev.softway.diagnostic.domain;

import dev.softway.diagnostic.domain.model.IndexSante;
import dev.softway.diagnostic.domain.model.UniteMedicale;

import java.util.ArrayList;
import java.util.List;

public class DiagnosticService {
    public List<UniteMedicale> redirigeVersUniteMedicale(int valeurIndexSante) {
        List<UniteMedicale> uniteMedicales = new ArrayList<>();
        IndexSante indexSante = new IndexSante(valeurIndexSante);
        if (indexSante.indiqueProblemeCardiaque()) {
            uniteMedicales.add(UniteMedicale.CARDIOLOGIE);
        }
        if (indexSante.indiqueFracture()) {
            uniteMedicales.add(UniteMedicale.TRAUMATOLOGIE);
        }
        return uniteMedicales;
    }
}
