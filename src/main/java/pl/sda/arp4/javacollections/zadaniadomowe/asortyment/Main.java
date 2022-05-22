package pl.sda.arp4.javacollections.zadaniadomowe.asortyment;

import pl.sda.arp4.javacollections.zadaniadomowe.zadanieVat.PodatekProduktu;

public class Main {
    public static void main(String[] args) {
        Asortyment asortyment = new Asortyment();

        Produkt marchew = new Produkt("Marchew", 1, PodatekProduktu.NO_VAT);
        asortyment.dodajWarzywo(marchew);

        Produkt serZolty = new Produkt("ser zolty", 1.40, PodatekProduktu.NO_VAT);
        Produkt serPlesniowy = new Produkt("ser plesniowy", 2.40, PodatekProduktu.NO_VAT);
        Produkt serKozi = new Produkt("ser kozi", 3.40, PodatekProduktu.NO_VAT);

        asortyment.dodajNabial(serZolty);
        asortyment.dodajNabial(serPlesniowy);
        asortyment.dodajNabial(serKozi);

        asortyment.wypisz();

        asortyment.wypiszTanszeNiz(5.0);

        asortyment.szukajProduktu("ser");
    }
}
