import java.util.Scanner;

public class Lulus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai = 0;
        System.out.println("Masukkan nilai : ");
        nilai = input.nextInt();

        if (nilai >= 75) {
            System.out.println("Selamat, Anda lulus!");
        } else {
            System.out.println("Maaf, Anda tidak lulus!");
        }

        input.close();
    }
}
