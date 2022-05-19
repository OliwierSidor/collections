package pl.sda.arp4.javacollections.zadaniadomowe.zadanie6;

//Stwórz aplikację, a w niej klasę Dziennik i student . Stwórz również klasę Student. Klasa
//        Student powinna:
//        - posiadać listę ocen studenta (List<Double>)
//        - posiadać (pole) numer indeksu studenta (String)
//        - posiadać (pole) imię studenta
//        - posiadać (pole) nazwisko studenta
//
//        Klasa Dziennik powinna:
//        - posiadać (jako pole) listę Studentów.
//        - posiadać metodę 'dodajStudenta(Student):void' do dodawania nowego studenta do
//        dziennika
//        - posiadać metodę 'usuńStudenta(Student):void' do usuwania studenta
//        - posiadać metodę 'usuńStudenta(String):void' do usuwania studenta po jego numerze
//        indexu
//        - posiadać metodę 'zwróćStudenta(String):Student' która jako parametr przyjmuje numer
//        indexu studenta, a w wyniku zwraca konkretnego studenta.
//        - posiadać metodę 'podajŚredniąStudenta(String):double' która przyjmuje indeks studenta
//        i zwraca średnią ocen studenta.
//        - posiadać metodę 'podajStudentówZagrożonych():List<Student>'
//        - posiadać metodę 'posortujStudentówPoIndeksie():List<Student>' - która sortuje listę
//        studentów po numerach indeksów, a następnie zwraca posortowaną listę.
//
//
//        Polecenia VarArgs:
//        - dodanie kilku studentów
//        - usunięcie kilku studentów
//        - wyszukiwanie studentów (i zwrócenie znalezionych w liście)
//        - dodanie/usuwanie ocen studentom
//        Wszystkie polecenia zrealizowane jako VarArgs.

import java.util.Scanner;

public class MainZadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dziennik dziennik = new Dziennik();

        System.out.println("Tu dziennik elektroniczny, napisz co chcesz zrobic (dodaj, usun, wypisz): ");
        String komenda;

        do {
            System.out.println("Podaj komende");
            komenda = scanner.next();
            if (komenda.equals("dodaj")) {
                System.out.println("Podaj imie:");
                String imie = scanner.next();

                System.out.println("Podaj nazwisko:");
                String nazwisko = scanner.next();

                System.out.println("Podaj nr indeksu:");
                String numerIndeksu = scanner.next();

                Student nowyStudent = new Student(imie, nazwisko, numerIndeksu);
                dziennik.dodajStudenta(nowyStudent);
            } else if (komenda.equalsIgnoreCase("wypisz")) {
                dziennik.wypisz();
            } else if (komenda.equalsIgnoreCase("usun")) {
                System.out.println("Podaj nr indeksu");
                String numerIndeksu = scanner.next();
                dziennik.usunStudenta(numerIndeksu);
            } else if (komenda.equalsIgnoreCase("zwroc")) {
                System.out.println("Podaj nr indeksu");
                String numerIndeksu = scanner.next();
                try {
                    Student student = dziennik.zwrocStudenta(numerIndeksu);
                    System.out.println(student);
                } catch (BrakStudentaExepction e) {
                    System.err.println("Nie znaleziono studenta");
                }
            } else {
                System.err.println("Podana komenda nie istnieje");
            }
        } while ((!komenda.equalsIgnoreCase("koniec")));
    }
}
