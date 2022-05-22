package pl.sda.arp4.javacollections.zadaniadomowe.zadanieVat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produkt> listaProduktow = new ArrayList<>();
        listaProduktow.add(new Produkt("masło", 2.30, PodatekProduktu.VAT8));
        listaProduktow.add(new Produkt("telewizor samsung", 100.1, PodatekProduktu.VAT23));
        listaProduktow.add(new Produkt("komputer samsung", 111.1, PodatekProduktu.VAT5));
        listaProduktow.add(new Produkt("mercedes", 0.50, PodatekProduktu.VAT23));
        listaProduktow.add(new Produkt("bułka", 5.00, PodatekProduktu.NO_VAT));
        listaProduktow.add(new Produkt("kamera", 110.00, PodatekProduktu.VAT5));

        System.out.println("Tylko VAT8%: ");
        for (Produkt produkt : listaProduktow) {
            if (produkt.getPodatek() == PodatekProduktu.VAT8) {
                System.out.println(produkt);
            }
        }
        System.out.println("---------------");
        System.out.println("Produkty powyzej 100");
        for (Produkt produkt : listaProduktow) {
            if (produkt.getCenaProduktu() > 100) {
                System.out.println(produkt);
            }
        }
        System.out.println("---------------");

        System.out.println("Produkty powyzej 110");
        for (Produkt produkt : listaProduktow) {
            if (produkt.getCenaProduktu() > 110) {
                System.out.println(produkt);
            }
        }
        System.out.println("---------------");
    }
}

