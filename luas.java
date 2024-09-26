import java.util.Scanner;

public class luas {
    public static void main(String[] args) {
        // membuat scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Menghitung Luas Bangun Datar");
        System.out.println("Pilih bangun datar yang ingin dihitung luasnya:");
        System.out.println("A. Persegi\nB. Persegi Panjang\nC. Segitiga\nD. Lingkaran");

        String op = input.nextLine(); // input op untuk memilih bangun datar

        if (op.equalsIgnoreCase("A") || op.equalsIgnoreCase("persegi")) {

            System.out.println("Masukkan panjang sisi persegi:");
            double sisi = input.nextDouble();
            double luas = sisi * sisi;
            System.out.println("Luas persegi adalah " + luas);

        } else if (op.equalsIgnoreCase("B") || op.equalsIgnoreCase("persegi panjang")) {

            System.out.println("Masukkan panjang persegi panjang:");
            double panjang = input.nextDouble();
            System.out.println("Masukkan lebar persegi panjang:");
            double lebar = input.nextDouble();
            double luas = panjang * lebar;
            System.out.println("Luas persegi panjang adalah " + luas);

        } else if (op.equalsIgnoreCase("C") || op.equalsIgnoreCase("segitiga")) {

            System.out.println("Masukkan alas segitiga:");
            double alas = input.nextDouble();
            System.out.println("Masukkan tinggi segitiga:");
            double tinggi = input.nextDouble();
            double luas = 0.5 * alas * tinggi;
            System.out.println("Luas segitiga adalah " + luas);

        } else if (op.equalsIgnoreCase("D") || op.equalsIgnoreCase("lingkaran")) {

            System.out.println("Masukkan jari-jari lingkaran:");
            double jari = input.nextDouble();
            double luas = 3.14 * jari * jari;
            System.out.println("Luas lingkaran adalah " + luas);

        } else {

            System.out.println("Input tidak valid");

        }
        input.close();
    }
}
