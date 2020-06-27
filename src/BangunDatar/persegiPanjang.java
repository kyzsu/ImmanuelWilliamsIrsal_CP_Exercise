package BangunDatar;

public class persegiPanjang extends BangunDatar {
    private final double panjang;
    private final double lebar;

    public persegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    protected double getLuas() {
        return panjang * lebar;
    }

    @Override
    protected String getNama() {
        return "Persegi panjang";
    }
}
