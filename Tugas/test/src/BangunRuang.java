import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class BangunRuang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator(',');
        DecimalFormat df = new DecimalFormat("#.##", symbols);

        System.out.println("Pilih bangun ruang:");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Lingkaran (Luas)");
        System.out.println("3. Kubus (Volume)");
        System.out.println("4. Lingkaran (Keliling)");
        System.out.println("Dalam satuan cm");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Masukan panjang");
                double panjang = input.nextDouble();
                System.out.println("Masukan lebar");
                double lebar = input.nextDouble();
                System.out.println("Luas persegi panjang adalah " + df.format(panjang * lebar) + "cm");
                break;
            case 2:
                System.out.println("Masukan jari-jari");
                double jariJari = input.nextDouble();
                System.out.println("Luas lingkaran adalah " + df.format(Math.PI * Math.pow(jariJari, 2)) + "cm");
                break;
            case 3:
                System.out.println("Masukan sisi");
                double sisi = input.nextDouble();
                System.out.println("Volume kubus adalah " + df.format(Math.pow(sisi, 3)) + "cm");
                break;
            case 4:
                System.out.println("Masukan jari-jari");
                double jariJari2 = input.nextDouble();
                System.out.println("Keliling lingkaran adalah " + df.format(2 * Math.PI * jariJari2) + "cm");
                break;
            default:
                System.out.println("Input tidak valid");
                break;
        }

        input.close();
    }
}