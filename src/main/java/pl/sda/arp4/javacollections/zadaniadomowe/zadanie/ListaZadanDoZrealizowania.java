package pl.sda.arp4.javacollections.zadaniadomowe.zadanie;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ListaZadanDoZrealizowania {

    List<Zadanie> listaZadan = new ArrayList<>();

    public void dodajZadanie(String nazwa, String tresc) {
        Zadanie zadanie = new Zadanie(nazwa, tresc);
        listaZadan.add(zadanie);
    }

    public void wypiszCale(String nazwaZadania) {
        for (Zadanie zadanie : listaZadan) {
            if (nazwaZadania.equals(zadanie.getNazwa())) {
                System.out.println(zadanie);
                return;
            }
        }
        System.out.println("Nie ma takiego zadania");
    }

    public void wypiszCzesc(String czescZadania) {
        for (Zadanie zadanie : listaZadan) {
            if (zadanie.getNazwa().contains(czescZadania)) {
                System.out.println(zadanie);
                return;
            }
        }
        System.out.println("Nie ma takiego zadania");
    }

    public Optional<Zadanie> zwrocCale(String nazwaZadania) {
        for (Zadanie zadanie : listaZadan) {
            if (nazwaZadania.equals(zadanie.getNazwa())) {
                return Optional.of(zadanie);
            }
        }
        return Optional.empty();
    }

    public Optional<Zadanie> zwrocCzesc(String nazwaZadania) {
        for (Zadanie zadanie : listaZadan) {
            if (zadanie.getNazwa().contains((nazwaZadania))) {
                return Optional.of(zadanie);
            }
        }
        return Optional.empty();
    }

    public void usun(String nazwa) {
        Optional<Zadanie> usunZadanie = zwrocCzesc(nazwa);
        if (usunZadanie.isPresent()) {
            listaZadan.remove(usunZadanie.get());
        }
    }

    public void zrealizuj(String nazwa) {
        Optional<Zadanie> zrealizujZadanie = zwrocCzesc(nazwa);
        if (zrealizujZadanie.isPresent()) {
            zrealizujZadanie.get().setZrealizowane(true);
        }
    }

    public void wypiszZrealizowane() {
        for (Zadanie zadanie : listaZadan) {
            if (zadanie.isZrealizowane()) {
                System.out.println(zadanie);
            }
        }
    }

    public void wypiszNiezrealizowane() {
        for (Zadanie zadanie : listaZadan) {
            if (!zadanie.isZrealizowane()) {
                System.out.println(zadanie);
            }
        }
    }

    public List<Zadanie> zwrocNiezrealizowane() {
        List<Zadanie> listaZadanNie = new ArrayList<>();
        for (Zadanie zadanie : listaZadan) {
            if (!zadanie.isZrealizowane()) {
                listaZadanNie.add(zadanie);
            }
        }
        return listaZadanNie;
    }
}


