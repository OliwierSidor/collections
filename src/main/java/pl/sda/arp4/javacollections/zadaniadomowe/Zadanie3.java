package pl.sda.arp4.javacollections.zadaniadomowe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Stwórz oddzielnego maina, a w nim kolejną listę String'ów. Wykonaj zadania:
 * - dodaj do listy elementy 10030, 3004, 4000, 12355, 12222, 67888, 111200, 225355,
 * 2222, 1111, 3546, 138751, 235912 (jako stringi) (dodaj je posługując się metodą Arrays.asList())
 */
public class Zadanie3 {
    public static void main(String[] args) {
//    - określ indeks elementu 138751 posługując się metodą indexOf
//    - sprawdź czy istnieje na liście obiekt 67888 metodą contains (wynik wypisz na ekran)
//    - sprawdź czy istnieje na liście obiekt 67889 metodą contains (wynik wypisz na ekran)
//    - usuń z listy obiekt 67888 oraz 67889 (metoda remove)
//    - wykonaj ponownie powyższe sprawdzenia.
//    - iteruj całą listę, wypisz elementy na ekran (a. w jednej linii, b. każdy element w oddzielnej linii).
        List<String> doSkopiowania = Arrays.asList("10030", "3004", "4000", "12355", "12222", "67888", "111200", "225355", "2222", "1111", "3546", "138751", "235912");
        List<String> lista = new ArrayList<>(doSkopiowania);

        //    - określ indeks elementu 138751 posługując się metodą indexOf
//        System.out.println("Indeks elementu: " + lista.indexOf(138751)); // to nigdy nie zadziała i jest niepoprawne
        System.out.println("Indeks elementu: " + lista.indexOf("138751"));

//        - sprawdź czy istnieje na liście obiekt 67889 metodą contains (wynik wypisz na ekran)
        boolean czyJestNaLiscie = lista.contains("67888");
        // Opcja 1:
        if (czyJestNaLiscie) {
            System.out.println("Jest na liście");
        } else {
            System.out.println("Nie ma go na liście");
        }

        // Opcja 2:
        System.out.println("Czy jest na liście: " + czyJestNaLiscie);

        // Opcja 3:
        System.out.println("Czy jest na liście: " + lista.contains("67888"));

        System.out.println("Czy jest na liście: " + lista.contains("67889"));

        // w tym przypadku ignoruje informację o tym czy element 67888 został usunięty
        lista.remove("67888");

        // w tym przypadku sprawdzam czy element 67889 został usunięty ( czy był na liście )
        boolean czyZostalUsuniety = lista.remove("67889");
        System.out.println("Czy został usunięty: " + czyZostalUsuniety);

//        - wykonaj ponownie powyższe sprawdzenia.
        System.out.println("Czy jest na liście: " + lista.contains("67888"));
        System.out.println("Czy jest na liście: " + lista.contains("67889"));

        System.out.println("W jednej linii:");
        for (int i = 0; i < lista.size(); i++) {
            String elementListy = lista.get(i);
            System.out.print(elementListy + " ");
        }

        // znak nowej linii żeby postawić na końcu wszystkich wypisanych wyżej elementów
        System.out.println();
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " ");
        }

        // znak nowej linii żeby postawić na końcu wszystkich wypisanych wyżej elementów
        System.out.println();
        for (String elementListy : lista) {
            System.out.print(elementListy + " ");
        }

        // znak nowej linii żeby postawić na końcu wszystkich wypisanych wyżej elementów
        System.out.println();
        System.out.println("W oddzielnych liniach:");
        for (int i = 0; i < lista.size(); i++) {
            String elementListy = lista.get(i);
            System.out.println((i + 1) + " " + elementListy);
        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + " " + lista.get(i));
        }

        // sztuczne rozwiązanie 3 pętli:
        int k = 0;
        for (String elementListy : lista) {
            System.out.println((k + 1) + " " + elementListy);
            k++;
        }
    }
}