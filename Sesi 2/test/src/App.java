import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        float x = 28000;
        System.out.println("\nHarga 1kg telur adalah Rp. 24.000");

        System.out.println("\nMasukan jumlah telur yang akan dibeli : ");
        float y = input.nextFloat();
        float telur = x * y;

        System.out.println("\nTotal harga telur adalah Rp. " + telur);
        System.out.println("\nMasukan uang anda : ");
        float uang = input.nextInt();

        float kembalian = uang - telur;

        System.out.println("\nKembalian anda adalah Rp. " + kembalian);

        input.close();
    }
}