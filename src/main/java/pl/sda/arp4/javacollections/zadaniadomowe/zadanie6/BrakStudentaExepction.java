package pl.sda.arp4.javacollections.zadaniadomowe.zadanie6;

public class BrakStudentaExepction extends Exception{
    public BrakStudentaExepction(String numerIndeksu){
        super("Nie znaleziono studenta o numerze indeksu: " + numerIndeksu);
    }
}
