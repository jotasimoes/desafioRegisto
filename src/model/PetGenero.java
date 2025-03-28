package model;

public enum PetGenero {
    Macho("Macho")
    ,Femea("Fêmea");

    private final String string;

    PetGenero(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return string;
    }
}
