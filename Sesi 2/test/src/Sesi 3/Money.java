import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program untuk menghitung pecahan uang");
        System.out.println("Masukkan jumlah uang : ");

        int uang = input.nextInt();
        int count100 = uang / 100000;
        uang = uang % 100000;

        int count50 = uang / 50000;
        uang = uang % 50000;

        int count20 = uang / 20000;
        uang = uang % 20000;

        int count10 = uang / 10000;
        uang = uang % 10000;

        int count5 = uang / 5000;
        uang = uang % 5000;

        int count2 = uang / 2000;
        uang = uang % 2000;

        int count1 = uang / 1000;
        uang = uang % 1000;

        int count05 = uang / 500;
        uang = uang % 500;

        int count01 = uang / 100;
        uang = uang % 100;

        System.out.println("Jumlah uang Rp 100.000 : " + count100);
        System.out.println("Jumlah uang Rp 50.000 : " + count50);
        System.out.println("Jumlah uang Rp 20.000 : " + count20);
        System.out.println("Jumlah uang Rp 10.000 : " + count10);
        System.out.println("Jumlah uang Rp 5.000 : " + count5);
        System.out.println("Jumlah uang Rp 2.000 : " + count2);
        System.out.println("Jumlah uang Rp 1.000 : " + count1);
        System.out.println("Jumlah uang Rp 500 : " + count05);
        System.out.println("Jumlah uang Rp 100 : " + count01);

        input.close();
    }
}
