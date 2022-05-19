package pl.sda.arp4.javacollections.zadaniadomowe.zadanie6;

public class BrakOcenExeption extends RuntimeException{
    public BrakOcenExeption(){
        super("Brak ocen do obliczenia średniej");
    }
}
