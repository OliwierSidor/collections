package pl.sda.arp4.javacollections.zadaniadomowe.zadanie;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        ListaZadanDoZrealizowania listaZadanDoZrealizowania = new ListaZadanDoZrealizowania();
        listaZadanDoZrealizowania.dodajZadanie("Test 1", "Test 11");
        listaZadanDoZrealizowania.dodajZadanie("Test 2", "Test 12");
        listaZadanDoZrealizowania.dodajZadanie("Test 3", "Test 13");
        listaZadanDoZrealizowania.dodajZadanie("Test 4", "Test 14");
        System.out.println("------------------------------------------------------");
        listaZadanDoZrealizowania.wypiszCale("Test 1");
        listaZadanDoZrealizowania.wypiszCale("Test1");
        System.out.println("------------------------------------------------------");
        listaZadanDoZrealizowania.wypiszCzesc("1");
        listaZadanDoZrealizowania.wypiszCzesc("9");
        listaZadanDoZrealizowania.wypiszCzesc("Test");
        System.out.println("------------------------------------------------------");
        Optional<Zadanie> test1 = listaZadanDoZrealizowania.zwrocCale("Test 1");
        Optional<Zadanie> test2 = listaZadanDoZrealizowania.zwrocCale("Test2");
        System.out.println(test1);
        System.out.println(test2);
        System.out.println("------------------------------------------------------");
        Optional<Zadanie> test3 = listaZadanDoZrealizowania.zwrocCzesc("Test 1");
        Optional<Zadanie> test4 = listaZadanDoZrealizowania.zwrocCzesc("Test");
        Optional<Zadanie> test5 = listaZadanDoZrealizowania.zwrocCzesc("9");
        System.out.println(test3);
        System.out.println(test4);
        System.out.println(test5);
        System.out.println("------------------------------------------------------");
        listaZadanDoZrealizowania.usun("Test 1");
        listaZadanDoZrealizowania.usun("Test 11");
        listaZadanDoZrealizowania.wypiszNiezrealizowane();
        System.out.println("------------------------------------------------------");
        listaZadanDoZrealizowania.zrealizuj("Test 2");
        listaZadanDoZrealizowania.zrealizuj("Test 3");
        listaZadanDoZrealizowania.wypiszZrealizowane();
        System.out.println("__");
        listaZadanDoZrealizowania.wypiszNiezrealizowane();
        System.out.println("__");
        List<Zadanie> niezrealizowane = listaZadanDoZrealizowania.zwrocNiezrealizowane();
        System.out.println(niezrealizowane);
    }
}
