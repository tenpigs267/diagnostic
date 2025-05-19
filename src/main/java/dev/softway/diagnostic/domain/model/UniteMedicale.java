package dev.softway.diagnostic.domain.model;

public enum UniteMedicale {
    CARDIOLOGIE("Cardiologie"),
    TRAUMATOLOGIE("Traumatologie");

    private final String label;

    UniteMedicale(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
