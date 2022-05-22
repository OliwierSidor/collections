package pl.sda.arp4.javacollections.zadaniadomowe.asortyment;

import pl.sda.arp4.javacollections.zadaniadomowe.zadanieVat.PodatekProduktu;

import java.util.ArrayList;
import java.util.List;

public class Asortyment {
    private List<Produkt> warzywa = new ArrayList<>();
    private List<Produkt> nabialy = new ArrayList<>();

    public void dodajWarzywo(Produkt produkt) {
        warzywa.add(produkt);
    }

    public void dodajNabial(Produkt produkt) {
        nabialy.add(produkt);
    }

    public void wypisz() {
        System.out.println("Warzywa");
        for (Produkt warzywo : warzywa) {
            System.out.println(warzywo);
        }
        System.out.println("Nabiał");
        for (Produkt nabial : nabialy) {
            System.out.println(nabial);
        }

    }

    public void wypiszTanszeNiz(double cena) {
        System.out.println("Produkty o cenie niższej niż " + cena + " :");
        for (Produkt warzywo : warzywa) {
            if (warzywo.cenaBrutto() < cena) {
                System.out.println(warzywo);
            }
        }
        for (Produkt nabial : nabialy) {
            if (nabial.cenaBrutto() < cena) {
                System.out.println(nabial);
            }
        }

    }

    public void szukajProduktu(String nazwa) {
        System.out.println("Produkty które w nazwie zawierają '" + nazwa + "' :");
        for (Produkt warzywo : warzywa) {
            if (warzywo.getNazwaProduktu().contains("ser")) {
                System.out.println(warzywo);
            }
        }
        for (Produkt nabial : nabialy) {
            if (nabial.getNazwaProduktu().contains("ser")) {
                System.out.println(nabial);
            }
        }

    }

    public void wypiszProduktyOpodatkowaneNa(PodatekProduktu podatekProduktu) {
        for (Produkt produkt : warzywa) {
            if (produkt.getPodatek() == podatekProduktu) ;
            System.out.println(produkt);
        }
        for (Produkt produkt : nabialy) {
            if (produkt.getPodatek() == podatekProduktu);
            System.out.println(produkt);
        }

    }
}
