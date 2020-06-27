package BangunDatar;

public class Persegi extends BangunDatar {
    private final double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    protected double getLuas() {
        return sisi*sisi;
    }

    @Override
    protected String getNama() {
        return "Persegi";
    }
}
