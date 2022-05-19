package pl.sda.arp4.javacollections.zadaniadomowe.zadanie6;
//        Student powinna:
//        - posiadać listę ocen studenta (List<Double>)
//        - posiadać (pole) numer indeksu studenta (String)
//        - posiadać (pole) imię studenta
//        - posiadać (pole) nazwisko studenta

import java.util.ArrayList;
import java.util.List;

public class Student {
    private List<Double> listaOcen;
    private String imie;
    private String nazwisko;
    private String numerIndeksu;

    public Student(String imie, String nazwisko, String numerIndeksu) {
        this.numerIndeksu = numerIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.listaOcen = new ArrayList<>();
    }

    public String getNumerIndeksu() {
        return numerIndeksu;
    }

    public double obliczSrednia() {
        if (listaOcen.isEmpty()) {
            throw new BrakOcenExeption();
        }
        double suma = 0.0;
        for (int i = 0; i < listaOcen.size(); i++) {
            suma += listaOcen.get(i);
        }
        return (suma / listaOcen.size());
    }

    @Override
    public String toString() {
        return "Student{" +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                "numerIndeksu='" + numerIndeksu + '\'' +
                '}';

    }
}
