package pl.sda.arp4.javacollections;

import java.util.*;

public class MainListaString {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String element;
        do {
            System.out.println("Wpisz kolejny element lub wpisz 'quit' aby zakonczyc");
            element = scanner.next();

            if (!element.equals("quit")) {
                lista.add(element);
            }
        } while (!element.equals("quit"));

        System.out.println(lista);

        System.out.println("Wpisz element do znalezienia: ");
        String szukanyElement = scanner.next();

        int indexSzukanegoElementu = lista.indexOf(szukanyElement);
        System.out.println("Znaleziono na ideksie: " + indexSzukanegoElementu);

        boolean czyZnaleziono = lista.contains(szukanyElement);
        System.out.println("Czy lista zawiera szukany element: " + czyZnaleziono);

        System.out.println("Czy lista jest pusta: " + lista.isEmpty());

        System.out.println("Rozmiar listy wynosi: " + lista.size());

//        Czyszczenie listy
        lista.clear();

//        Skopiowanie listy
        List<String> kopia = new ArrayList<>(lista);

        Collections.sort(lista);

    }
}
