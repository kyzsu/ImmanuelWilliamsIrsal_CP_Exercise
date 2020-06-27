package BangunDatar;

import java.io.IOException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Penghitung Luas Bangun Datar");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Layang-layang");
            System.out.println("5. Lingkaran");
            System.out.print("Input: ");
            int pilihan = scanner.nextInt();
            System.out.println();

            switch (pilihan){
                case 1:
                    try {
                        System.out.println("Persegi");
                        System.out.print("Sisi: ");
                        double sisi = scanner.nextDouble();
                        Persegi persegi = new Persegi(sisi);
                        System.out.println("Luas "+persegi.getNama()+" adalah "+persegi.getLuas());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        System.out.println("Persegi Panjang");
                        System.out.print("Panjang: ");
                        double pjg = scanner.nextDouble();
                        System.out.print("Lebar: ");
                        double lbr = scanner.nextDouble();
                        persegiPanjang persegiPanjang = new persegiPanjang(pjg,lbr);
                        System.out.println("Luas "+persegiPanjang.getNama()+" adalah "+persegiPanjang.getLuas());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        System.out.println("Segitiga");
                        System.out.print("Alas: ");
                        double alas = scanner.nextDouble();
                        System.out.print("Tinggi: ");
                        double tinggi = scanner.nextDouble();
                        Segitiga segitiga = new Segitiga(alas,tinggi);
                        System.out.println("Luas "+segitiga.getNama()+" adalah "+segitiga.getLuas());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    try {
                        System.out.println("Layang-layang");
                        System.out.print("Diagonal 1: ");
                        double d1 = scanner.nextDouble();
                        System.out.print("Diagonal 2: ");
                        double d2 = scanner.nextDouble();
                        LayangLayang layangLayang = new LayangLayang(d1,d2);
                        System.out.println("Luas "+layangLayang.getNama()+" adalah "+layangLayang.getLuas());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5:
                    try {
                        System.out.println("Lingkaran");
                        System.out.print("Jari-jari: ");
                        double r = scanner.nextDouble();
                        Lingkaran lingkaran = new Lingkaran(r);
                        System.out.println("Luas "+lingkaran.getNama()+" adalah "+lingkaran.getLuas());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;

                default:
                    System.out.println("Salah input!");
                    break;
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
