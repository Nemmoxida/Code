import java.util.ArrayList;
import java.util.Scanner;

public class nambatu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] Buah = {
            {"apel", "35000"},
            {"jeruk", "50000"},
            {"mangga", "25000"},
            {"duku", "15000"},
            {"semangka", "20000"}
        };

        ArrayList<String[]> cart = new ArrayList<>();
        boolean belanjaLagi = true;
        
        while (belanjaLagi) {
            System.out.println("Menu:\n1. Beli Buah\n2. Struk Belanja\n3. Keluar");
            System.out.print("Masukkan pilihan: ");
            int pilihan = input.nextInt();
            
            if (pilihan == 1) {
                // Pilih Buah
                System.out.println("Pilih Buah (0-4): ");
                for (int i = 0; i < Buah.length; i++) {
                    System.out.println(i + ". " + Buah[i][0] + " - Rp" + Buah[i][1]);
                }
                
                System.out.print("Masukkan nomor buah: ");
                int pilihBuah = input.nextInt();
                System.out.print("Masukkan jumlah: ");
                int jumlah = input.nextInt();
                
                int harga = Integer.parseInt(Buah[pilihBuah][1]);
                int subtotal = harga * jumlah;
                
                cart.add(new String[]{Buah[pilihBuah][0], String.valueOf(jumlah), String.valueOf(harga), String.valueOf(subtotal)});
                
                
            } else if (pilihan == 2) {
                // Struk Belanja
                int total = 0;
                System.out.println("Daftar Belanja:");
                System.out.println("========================================");
                System.out.println("No. Nama Buah   Jumlah  Harga  Subtotal");
                for (int i = 0; i < cart.size(); i++) {
                    String[] item = cart.get(i);
                    System.out.printf("%d. %-10s %-6s Rp%-7s Rp%s\n", (i + 1), item[0], item[1], item[2], item[3]);
                    total += Integer.parseInt(item[3]);
                }
                System.out.println("========================================");
                System.out.println("Total: Rp" + total);
                int discount = (int) (total * 0.15);  // 15% diskon
                System.out.println("Discount(15%): Rp" + discount);
                System.out.println("Total bayar: Rp" + (total - discount));
                
            } else if (pilihan == 3) {
                // Keluar
                System.out.println("Terima kasih sudah berbelanja!");
                break;
            }
        }
        
        input.close();
    }
}

