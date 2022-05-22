package pl.sda.arp4.javacollections.zadaniadomowe.zadanieVat;

public class Produkt {
    private String nazwaProduktu;
    private double cenaProduktu;
    private PodatekProduktu podatek;

    public String getNazwaProduktu() {
        return nazwaProduktu;
    }

    public void setNazwaProduktu(String nazwaProduktu) {
        this.nazwaProduktu = nazwaProduktu;
    }

    public double getCenaProduktu() {
        return cenaProduktu;
    }

    public void setCenaProduktu(double cenaProduktu) {
        this.cenaProduktu = cenaProduktu;
    }

    public PodatekProduktu getPodatek() {
        return podatek;
    }

    public void setPodatek(PodatekProduktu podatek) {
        this.podatek = podatek;
    }

    public Produkt(String nazwaProduktu, double cenaProduktu, PodatekProduktu podatekProduktu) {
        this.nazwaProduktu = nazwaProduktu;
        this.cenaProduktu = cenaProduktu;
        this.podatek = podatekProduktu;

        }
    public double cenaBrutto () {
        return cenaProduktu + (cenaProduktu * podatek.getWartoscPodatku());
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "nazwaProduktu='" + nazwaProduktu + '\'' +
                ", cenaProduktu=" + cenaProduktu +
                ", podatek=" + podatek +
                '}';
    }
}
