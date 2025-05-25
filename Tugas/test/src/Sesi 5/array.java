import java.util.Scanner;
import java.text.DecimalFormat;

public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Berapa banyak data yang ingin anda input?");
        int n = input.nextInt();
        double umurAvg = 0;
        double umurTotal = 0;
        String data [][] = new String[n][2];

        for (int i = 0; i < n; i++) {
            System.out.println("Nama Mahasiswa " + (i+1));
            data[i][0] = input.next();
            System.out.println("Umur " + (i+1));
            data[i][1] = input.next();
        }

        System.out.println("\nData yang telah diinputkan adalah: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Nama Mahasiswa" + (i+1) + ": " + data[i][0]);
            System.out.println("Umur Mahasiswa" + (i+1) + ": " + data[i][1]);
        }
        
        for (int i = 0; i < n; i++) {
            int data2 = Integer.parseInt(data[i][1]);
            umurTotal += data2;
            umurAvg = umurTotal / (double)n;
        }

        
        System.out.println("\nUmur rata rata adalah : " + df.format(umurAvg));
        
        input.close();
    }
}
