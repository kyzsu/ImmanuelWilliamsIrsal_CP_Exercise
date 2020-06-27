package BangunDatar;

public class Segitiga extends BangunDatar {
    private final double alas;
    private final double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    protected double getLuas() {
        return 0.5*alas*tinggi;
    }

    @Override
    protected String getNama() {
        return "Segitiga";
    }
}
