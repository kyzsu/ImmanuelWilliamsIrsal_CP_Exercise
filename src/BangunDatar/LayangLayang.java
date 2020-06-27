package BangunDatar;

public class LayangLayang extends bangunDatar{
    private final double diagonal1;
    private final double diagonal2;

    public LayangLayang(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    protected double getLuas() {
        return 0.5*diagonal1*diagonal2;
    }

    @Override
    protected String getNama() {
        return "Layang-layang";
    }
}
