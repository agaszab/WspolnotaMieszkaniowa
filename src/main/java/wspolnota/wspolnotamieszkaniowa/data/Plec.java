package wspolnota.wspolnotamieszkaniowa.data;

public enum Plec {
    KOBIETA ("Kobieta"),
    MEZCZYZNA ("Mężczyzna");

    private String name;

    Plec(String name) {
        this.name = name;
    }

    Plec() {
    }

    public String getName() {
        return name;
    }


}
