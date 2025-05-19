package dev.softway.diagnostic.domain.model;

public record IndexSante(int valeur) {

    //TODO : voir si besoin de, et comment, traiter les valeurs 0 ou négatives avec le PO

    public boolean indiqueProblemeCardiaque() {
        return (valeur % 3) == 0;
    }

    public boolean indiqueFracture() {
        return (valeur % 5) == 0;
    }
}
