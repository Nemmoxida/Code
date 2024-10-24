import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');

        DecimalFormat df = new DecimalFormat("#,###.##", symbols);

        float x = 20000;
        System.out.println("\nHarga 1kg telur adalah Rp. 20.000");

        System.out.println("\nMasukan jumlah telur yang akan dibeli : ");
        float y = input.nextFloat();
        float telur = x * y;

        System.out.println("\nTotal harga telur adalah Rp. " + df.format(telur));
        System.out.println("\nMasukan uang anda : ");
        float uang = input.nextInt();

        double diskon = 0;

        if (telur >= 100000) {
            // diskon = 10000;
            // System.out.println("\nAnda mendapatkan diskon " + df.format(diskon));

            System.out.println("\nSelamat anda mendapatkan sprei gratis");
        } else {
            diskon = 0;
        }

        double kembalian = 0;
        if (diskon > 0){
            kembalian = uang - (telur - diskon);
        } else if (diskon == 0){
            kembalian = uang - telur;
        }



        if (kembalian < 0) {
            System.out.println("\nUang anda kurang Rp. " + df.format(kembalian));
            
        } else{
            System.out.println("\nKembalian anda adalah Rp. " + df.format(kembalian));
        }

        input.close();
    }
}