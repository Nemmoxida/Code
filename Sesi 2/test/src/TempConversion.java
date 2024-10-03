import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class TempConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Mengatur simbol untuk koma sebagai pemisah desimal dan titik sebagai pemisah
        // ribuan
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');

        // Membuat objek DecimalFormat dengan pola dan simbol yang diatur
        DecimalFormat df = new DecimalFormat("#,###.##", symbols);

        int suhu = 0; // adalah variable yang berisi format temperatur pertama yang akan dipilih
        double suhuValue = 0;   // adalah variable yang berisi nilai temperatur pertama yang akan di konversi

        System.out.println("Konversi suhu");
        System.out.println("Pilih suhu mana yang ingin di konversi");
        System.out.println("1. Celcius\n2. Fahrenheit\n3. Kelvin");
        System.out.println("Gunakan nomor angkanya saja");

        // block untuk memasukan jenis suhu
        while (true) {
            try {
                suhu = input.nextInt(); // input jenis suhu
                if (suhu > 0 && suhu < 4) { // jika pilihan di luar 1, 2, 3 maka akan diulang
                    break;
                } else {
                    System.out.println("\nInput tidak valid. Coba lagi.");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nInput tidak valid. Coba lagi.");
                input.next();
            }
        }

        // block untuk memasukan nilai suhu
        while (true) {
            try {

                System.out.println("\nBerapa suhunya?");
                suhuValue = input.nextDouble(); // input nilai suhu
                if (suhu == 3 && suhuValue < 0) { // Memastikan agar suhu kelvin tidak negatif
                    System.out.println("Tidak bisa menggunakan nilai negatif untuk Kelvin");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.err.println("\nInput tidak valid. Coba lagi.");
                input.next();
            }
        }


        System.out.println("\nIngin di konversi ke mana?");
        System.out.println("1. Celcius\n2. Fahrenheit\n3. Kelvin");
        System.out.println("Gunakan nomor angkanya saja");
        int choice = 0; // variable yang menentukan format konversi suhu

        // block untuk memasukan pilihan konversi
        while (true) {
            try {
                choice = input.nextInt(); // memasukan value untuk choice (untuk konversi)
                if (choice > 0 && choice < 4) { // jika pilihan di luar 1, 2, 3 maka akan diulang
                    break;
                } else {
                    System.out.println("\nInput tidak valid. Coba lagi.");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nInput tidak valid. Coba lagi.");
                input.next();
            }
        }

        // block untuk menghitung nilai suhu
        double a = 0;
        if (suhu == 1) {
            a = suhuValue;
        }
        if (suhu == 2) {
            a = suhuValue - 32;
        }
        if (suhu == 3) {
            a = suhuValue - 273.15;
        }

        double b = 0;
        // block untuk proses konversi
        if (choice == 1 && suhu == 3) {
            b = a;
        }
        if (choice == 1 && suhu != 3) {
            b = a * 5 / 9.0;
        }
        if (choice == 2) {
            b = a * 9 / 5.0 + 32;

        }
        if (choice == 3 && suhu == 1) {
            b = a + 273.15;
        }
        if (choice == 3 && suhu != 1) {
            b = a * 5 / 9.0 + 273.15;
        }

        // block untuk menampilkan format awal suhu
        String namaSuhu = "";
        if (suhu == 1) {
            namaSuhu = "Celcius";
        } else if (suhu == 2) {
            namaSuhu = "Fahrenheit";
        } else {
            namaSuhu = "Kelvin";
        }

        // block untuk menampilkan format konversi suhu
        String namaSuhuKonversi = "";
        if (choice == 1) {
            namaSuhuKonversi = "Celcius";
        } else if (choice == 2) {
            namaSuhuKonversi = "Fahrenheit";
        } else {
            namaSuhuKonversi = "Kelvin";
        }

        System.out.println("\nHasil konversi suhu dari " + df.format(suhuValue) + " " + namaSuhu + " ke " + namaSuhuKonversi
                + " adalah: " + df.format(b) + " " + namaSuhuKonversi);

        input.close();
    }
}
