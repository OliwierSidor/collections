package pl.sda.arp4.javacollections.zadaniadomowe.zadanie5;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<StudentZadanie5> lista = new ArrayList<>();
        StudentZadanie5 student1 = new StudentZadanie5("Adam", "Mickiewicz", "123456", Plec.MEZCZYZNA);
        StudentZadanie5 student2 = new StudentZadanie5("Wisława", "Szymborska", "234567", Plec.KOBIETA);
        StudentZadanie5 student3 = new StudentZadanie5("Kazimierz", "Przerwa-Tetmajer", "345678", Plec.MEZCZYZNA);
        StudentZadanie5 student4 = new StudentZadanie5("Olga", "Tokarczuk", "456789", Plec.KOBIETA);

        lista.add(student1);
        lista.add(student2);
        lista.add(student3);
        lista.add(student4);

        System.out.println(lista);

        System.out.println("-----------------------------------------------------------------------------------------");


        for (StudentZadanie5 student : lista) {
            System.out.println(student);
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        for (int i = 0; i < lista.size(); i++) {
            Plec plec = lista.get(i).getPlec();
            if (plec.equals(Plec.KOBIETA)) {
                System.out.println("Kobiety: " + lista.get(i));

            } else if (plec.equals(Plec.MEZCZYZNA)) {
                System.out.println("Mężczyźni: " + lista.get(i));

            }
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        for (StudentZadanie5 studentZadanie5 : lista) {
            String indeks = studentZadanie5.getNumerIndeksu();
            System.out.println("Numery indeksow: " + indeks);
        }

    }
}
