import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class sesi7 {
    public static void main(String[] args) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');


        DecimalFormat df = new DecimalFormat("#,###.##", symbols);
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan gaji");
        double gaji = input.nextDouble();

        System.out.println("Masukan jumlah jam lembur");
        int jamLembur = input.nextInt();


        int hasil = 0;
        double result = gaji / 173;
        int roundedUpResult = (int) Math.ceil(result);

        if (jamLembur - 4 < 0) {
            hasil = roundedUpResult * jamLembur;
        } else{
            int jamLembutDouble = jamLembur - 4;
            hasil = roundedUpResult * 4;
            hasil += roundedUpResult*2*jamLembutDouble;

        }

        System.out.println("Upan lembur anda adalah " +df.format(hasil ));
        System.out.println("Gaji anda adalah " + df.format(gaji + hasil));

        input.close();
    }
}
