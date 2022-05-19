package pl.sda.arp4.javacollections.zadaniadomowe;
//      Stwórz listę Integerów. Wykonaj zadania:
//        - dodaj do listy 5 elementów ze scannera
//        - dodaj do listy 5 elementów losowych
//        - wypisz elementy
//        Sprawdź działanie aplikacji.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MainZadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj " + (i + 1) + " z 5 elementów: ");
            int podanyElement = scanner.nextInt();
            lista.add(podanyElement);
        }
        for (int i = 0; i < 5; i++) {
            lista.add(new Random().nextInt(100));
        }
        System.out.println(lista);
    }
}
