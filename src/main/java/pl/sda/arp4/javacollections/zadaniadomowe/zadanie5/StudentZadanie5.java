package pl.sda.arp4.javacollections.zadaniadomowe.zadanie5;

public class StudentZadanie5 {
    private String numerIndeksu;
    private String imie;
    private String naziwsko;

    public String getNumerIndeksu() {
        return numerIndeksu;
    }

    public Plec getPlec() {
        return plec;
    }

    private Plec plec;

    public StudentZadanie5(String imie, String naziwsko, String numerIndeksu, Plec plec) {
        this.numerIndeksu = numerIndeksu;
        this.imie = imie;
        this.naziwsko = naziwsko;
        this.plec = plec;
    }

    @Override
    public String toString() {
        return "StudentZadanie5{" +
                "numerIndeksu='" + numerIndeksu + '\'' +
                ", imie='" + imie + '\'' +
                ", naziwsko='" + naziwsko + '\'' +
                ", plec=" + plec +
                '}';
    }
}
