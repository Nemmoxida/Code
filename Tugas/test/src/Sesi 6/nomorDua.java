import java.util.ArrayList;
import java.util.Scanner;

public class nomorDua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] Buah = { // Array of Fruit with price
            {"apel", "35000"},
            {"jeruk", "50000"},
            {"mangga", "25000"},
            {"duku", "15000"},
            {"semangka", "20000"}
        };

        ArrayList<String[]> cart = new ArrayList<>();   // Array List for cart
        boolean belanjaLagi = true;
        
        while (belanjaLagi) {   // Looping for shopping, if belanjaLagi is true
            System.out.println("Menu:\n1. Beli Buah\n2. Struk Belanja\n3. Keluar");
            System.out.print("Masukkan pilihan: ");
            int pilihan = input.nextInt();  // Input choice
            
            if (pilihan == 1) {
                // Pilih Buah
                System.out.println("Pilih Buah (0-4): ");
                for (int i = 0; i < Buah.length; i++) { // Looping for fruit list
                    System.out.println(i + ". " + Buah[i][0] + " - Rp" + Buah[i][1]);
                }
                
                System.out.print("Masukkan nomor buah: ");
                int pilihBuah = input.nextInt();    // Input fruit number
                System.out.print("Masukkan jumlah: ");
                int jumlah = input.nextInt();       // Input quantity
                
                int harga = Integer.parseInt(Buah[pilihBuah][1]);
                int subtotal = harga * jumlah;    // Calculate subtotal
                
                cart.add(new String[]{Buah[pilihBuah][0], String.valueOf(jumlah), String.valueOf(harga), String.valueOf(subtotal)});    // Add to cart
                
                
            } else if (pilihan == 2) {  
                // Struk Belanja
                int total = 0;
                System.out.println("Daftar Belanja:");
                System.out.println("========================================");
                System.out.println("No. Nama Buah   Jumlah  Harga  Subtotal");
                for (int i = 0; i < cart.size(); i++) { // Looping for cart
                    String[] item = cart.get(i);    // Get item from cart
                    System.out.printf("%d. %-10s %-6s Rp%-7s Rp%s\n", (i + 1), item[0], item[1], item[2], item[3]); // Print item
                    total += Integer.parseInt(item[3]); // Calculate total
                }
                System.out.println("========================================");
                System.out.println("Total: Rp" + total);
                int discount = (int) (total * 0.15);  // 15% discount
                System.out.println("Discount(15%): Rp" + discount);
                System.out.println("Total bayar: Rp" + (total - discount));
                
            } else if (pilihan == 3) {
                // Quit
                System.out.println("Terima kasih sudah berbelanja!");
                break;
            }
        }
        
        input.close();
    }
}

