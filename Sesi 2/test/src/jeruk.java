import java.util.Scanner;

public class jeruk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jeruk = 0;
        int count5 = 0;
        int count2 = 0;
        int count1 = 0;
        System.out.println("Masukan jumlah jeruk yang akan di beli : ");
        jeruk = input.nextInt();

        while (jeruk >= 5) {
            jeruk -= 5;
            count5++;
        }

        while (jeruk >= 2) {
            jeruk -= 2;
            count2++;
        }

        while (jeruk >= 1) {
            jeruk -= 1;
            count1++;
        }

        System.out.println("Jumlah yang harus di bayar " + (count5 * 10000 + count2 * 5000 + count1 * 3000));

        input.close();
    }
}
