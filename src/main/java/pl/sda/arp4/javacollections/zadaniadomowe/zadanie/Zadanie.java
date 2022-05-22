package pl.sda.arp4.javacollections.zadaniadomowe.zadanie;

import java.time.LocalDateTime;

public class Zadanie {
    String nazwa;
    String tresc;
    LocalDateTime data;
    boolean zrealizowane;

    public Zadanie(String nazwa, String tresc) {
        this.nazwa = nazwa;
        this.tresc = tresc;
        this.data = LocalDateTime.now();
        this.zrealizowane = false;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public boolean isZrealizowane() {
        return zrealizowane;
    }

    public void setZrealizowane(boolean zrealizowane) {
        this.zrealizowane = zrealizowane;
    }

    @Override
    public String toString() {
        String zrealizowaneTekst;
        if(zrealizowane){
            zrealizowaneTekst = "zrealizowane";
        } else {
            zrealizowaneTekst = "niezrealizowane";
        }
        return "Zadanie{" +
                "nazwa='" + nazwa + '\'' +
                ", tresc='" + tresc + '\'' +
                ", data=" + data +
                ", " + zrealizowaneTekst +
                '}';
    }
}
