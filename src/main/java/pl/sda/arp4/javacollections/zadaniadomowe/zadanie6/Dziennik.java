package pl.sda.arp4.javacollections.zadaniadomowe.zadanie6;

import java.util.ArrayList;
import java.util.List;

public class Dziennik {
    private List<Student> lista = new ArrayList<>();

    public void dodajStudenta(Student student) {
        lista.add(student);

    }

    public void usunStudenta(Student student) {
        lista.remove(student);
    }

    public void usunStudenta(String numerIndeksu) {
        for (int i = 0; i < lista.size(); i++) {
            Student sprawdzanyStudentI = lista.get(i);
            String numerIndeksuStudentaI = sprawdzanyStudentI.getNumerIndeksu();

            if (numerIndeksu.equals(numerIndeksuStudentaI)) {
                lista.remove(sprawdzanyStudentI);
                System.out.println("Usunięto studenta: " + sprawdzanyStudentI);
                return;
            }
        }
        System.out.println("Nie znaleziono studenta");
    }

    public Student zwrocStudenta(String numerIndeksu) throws BrakStudentaExepction {
        for (int i = 0; i < lista.size(); i++) {
            Student sprawdzanyStudentI = lista.get(i);
            String numerIndeksuStudentaI = sprawdzanyStudentI.getNumerIndeksu();

            if (numerIndeksu.equals(numerIndeksuStudentaI)) {
                return sprawdzanyStudentI;
            }
        }
        throw new BrakStudentaExepction(numerIndeksu);
    }

    public double podajSredniaStudenta(String numerIndeksu) throws BrakStudentaExepction{
        for (int i = 0; i < lista.size(); i++) {
            Student sprawdzanyStudentI = lista.get(i);
            String numerIndeksuStudentaI = sprawdzanyStudentI.getNumerIndeksu();

            if (numerIndeksu.equals(numerIndeksuStudentaI)) {
                double srednia = sprawdzanyStudentI.obliczSrednia();
                return srednia;
            }
        }throw new BrakStudentaExepction(numerIndeksu);

    }
    public void wypisz(){
        System.out.println("Lista studentów");
        for (Student student: lista) {
            System.out.println(student);
        }
    }
//    public Student zwrocStudentaNull(String numerIndeksu) {
//        for (int i = 0; i < lista.size(); i++) {
//            Student sprawdzanyStudentI = lista.get(i);
//            String numerIndeksuStudentaI = sprawdzanyStudentI.getNumerIndeksu();
//
//            if (numerIndeksu.equals(numerIndeksuStudentaI)) {
//                return sprawdzanyStudentI;
//            }
//        }
//        return null;
//    }
}
