import java.util.Random;
import java.util.Scanner;

public class rng {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rng = new Random().nextInt(10) + 1;
        int chance = 1;

        System.out.println("Tebak angka dari 1-10");
        System.out.println("Anda memiliki 3 kesempatan");
        int guess = input.nextInt();

        while (true) {

            if (guess > 10) {
                System.out.println("Masukan angka yangs valid");
                break;
            }
            if (chance == 3) {
                System.out.println("\nKesempatan anda habis");

                break;
            }
            if (rng == guess) {
                System.out.println("\nTebakan anda benar");
                break;

            }

            if (guess < rng) {
                System.out.println("\nTebakan anda terlalu kecil");
                guess = input.nextInt();
                chance++;
            }
            if (guess > rng) {
                System.out.println("\nTebakan anda terlalu besar");
                guess = input.nextInt();
                chance++;
            }

        }
        input.close();
    }
}
