package pl.sda.arp4.javacollections.zadaniadomowe.zadanie5;

public enum Plec {
    KOBIETA("Kobieta"),
    MEZCZYZNA("Mężczyzna");

    String nazwa;

    @Override
    public String toString() {
        return "Plec{" +
                "nazwa='" + nazwa + '\'' +
                '}';
    }

    Plec (String nazwa){
        this.nazwa = nazwa;
    }

}

