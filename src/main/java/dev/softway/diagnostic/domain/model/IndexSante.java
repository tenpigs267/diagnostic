package dev.softway.diagnostic.domain.model;

public record IndexSante(int valeur) {

    public boolean indiqueProblemeCardiaque() {
        return (valeur % 3) == 0;
    }

    public boolean indiqueFracture() {
        return (valeur % 5) == 0;
    }
}
