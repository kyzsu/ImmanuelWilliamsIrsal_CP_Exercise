package BangunDatar;

public class Lingkaran extends BangunDatar {
    private final double jarijari;

    public Lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }

    @Override
    protected double getLuas() {
        return Math.PI*jarijari*jarijari;
    }

    @Override
    protected String getNama() {
        return "Lingkaran";
    }
}
