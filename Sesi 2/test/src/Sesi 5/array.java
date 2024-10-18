import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Berapa banyak data yang ingin anda input?");
        int n = input.nextInt();
        String data [][] = new String[n][2];

        for (int i = 0; i < n; i++) {
            System.out.println("Nama Mahasiswa " + (i+1));
            data[i][0] = input.next();
            System.out.println("Umur " + (i+1));
            data[i][1] = input.next();
        }

        System.out.println("Data yang telah diinputkan adalah: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Nama Mahasiswa" + (i+1) + ": " + data[i][0]);
            System.out.println("Umur Mahasiswa" + (i+1) + ": " + data[i][1]);
        }

        input.close();
    }
}
