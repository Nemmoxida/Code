import java.util.Scanner;

public class sesi4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih nomor 1-5 (atau 0 untuk keluar):");
        int pilihan = input.nextInt();

        while (true) {
            if (pilihan == 0) {
                System.out.println("Program selesai.");
                break;
            }

            switch (pilihan) {
                case 1:
                    method1();
                    break;
                case 2:
                    method2();
                    break;
                case 3:
                    method3();
                    break;
                case 4:
                    method4();
                    break;
                case 5:
                    method5();
                    break;
                default:
                    System.out.println("Nomor tidak valid, coba lagi.");
                    break;
            }
            System.out.println("\nPilih nomor 1-5 (atau 0 untuk keluar):");
            pilihan = input.nextInt();
        }

        input.close();
    }


    public static void method1() {
        int a = 4; 

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void method2() {
        int a = 0;
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                a++;
                System.out.print(a + " ");
            }
            a++;
            System.out.println();
        }
    }

    public static void method3() {
        int a = 5;
        int b = 0;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= 3; j++) {
                b -= 1;
                System.out.print(b + " ");
                b += 1;
                System.out.print(b + " ");
            }
            System.out.println();

            if (i % 2 == 0) {
                b -= 1;
            } else {
                b += 1;
            }
        }
    }
    public static void method4() {
        int a = 0;
        int b = 20;

        for (int i = 0; i < 2; i++){
            System.out.println("");
            for ( int j = 0; j < 5; j++){
                a += 1;
                System.out.print( + a + " ");
            }

            System.out.println("");
            for (int f = 0; f < 5; f++){
                System.out.print(b + " ");
                b -= 1;
            }
        }
    }

    public static void method5() {
        int rows = 3;

        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
