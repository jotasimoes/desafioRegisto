package model;

public enum PetTipo {
    Cao("Cão"),
    Gato("Gato");

    private final String string;

    PetTipo(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return string;
    }
}
