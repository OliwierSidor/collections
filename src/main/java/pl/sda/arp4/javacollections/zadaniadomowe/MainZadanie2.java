package pl.sda.arp4.javacollections.zadaniadomowe;

import java.util.*;

public class MainZadanie2 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lista.add(new Random().nextInt(1000));
        }
        System.out.println("Wypisane elementy to: " + lista);
        double suma = 0;
        for (int i = 0; i < 10; i++) {
            suma += lista.get(i);
        }
        System.out.println("Suma elementów to: " + suma);
        System.out.println("Średnia elementów na liście to: " + (suma / 10d));

        ArrayList<Integer> posortowaneLiczby = new ArrayList<>(lista);
        Collections.sort(posortowaneLiczby);
        double mediana;
        if (posortowaneLiczby.size() % 2 == 0) {
            int rozmiarListy = posortowaneLiczby.size();
            int indeksSrodkowegoElementu = rozmiarListy / 2;
            int liczba1 = posortowaneLiczby.get(indeksSrodkowegoElementu);
            int liczba2 = posortowaneLiczby.get(indeksSrodkowegoElementu - 1);
            mediana = (liczba1 + liczba2) / 2d;
        } else {
            int rozmiarListy = posortowaneLiczby.size();
            int indeksSrodkowegoElementu = rozmiarListy/2;
            mediana = posortowaneLiczby.get(indeksSrodkowegoElementu);
        }

        System.out.println("Liczby w kolejności od najmniejszej do największej: " + posortowaneLiczby);
        System.out.println("Mediana: " + mediana);

        int najwieksza = lista.get(0);
        int najmniejsza = lista.get(0);

        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) > najwieksza) {
                najwieksza = lista.get(i);
            } else if (lista.get(i) < najmniejsza) {
                najmniejsza = lista.get(i);
            }
        }
        System.out.println("Najwieksza liczba w zbiorze to: " + najwieksza);
        System.out.println("Najmniejsza liczba w zbiorze to: " + najmniejsza);

        int indeksNajmniejszej = 0;
        int indeksNajwiekszej = 0;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == najwieksza) {
                indeksNajwiekszej = i;
            } else if (lista.get(i) == najmniejsza) {
                indeksNajmniejszej = i;
            }
        }
        System.out.println("Najwieksza liczba jest na indexie: " + indeksNajwiekszej);
        System.out.println("Najwieksza liczba jest na indexie: " + lista.indexOf(najwieksza));
        System.out.println("Najmniejsza liczba jest na indexie: " + indeksNajmniejszej);
        System.out.println("Najmniejsza liczba jest na indexie: " + lista.indexOf(najmniejsza));
    }
}
