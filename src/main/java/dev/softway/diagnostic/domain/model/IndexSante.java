package dev.softway.diagnostic.domain.model;

public record IndexSante(int valeur) {

    public boolean problemeCardiaque() {
        return true;
    }
}
