import java.util.Scanner;

public class jeruk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan jumlah jeruk yang akan di beli : ");
        int jeruk = input.nextInt();

        int count5 = jeruk / 5;
        jeruk = jeruk % 5;

        int count2 = jeruk / 2;
        jeruk = jeruk % 2;

        int count1 = jeruk;

        System.out.println("Jumlah yang harus di bayar " + (count5 * 10000 + count2 * 5000 + count1 * 3000));

        input.close();
    }
}
