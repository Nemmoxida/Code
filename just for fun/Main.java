import java.util.Scanner;

class Item {
    String name;
    int quantity;

    // Constructor
    Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    // Method untuk menampilkan informasi item
    public void display() {
        System.out.println("Item Name: " + name + ", Quantity: " + quantity);
    }
}

class Customer {
    String name;
    String email;

    // Constructor
    Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Method untuk menampilkan informasi customer
    public void display() {
        System.out.println("Customer Name: " + name + ", Email: " + email);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input untuk items
        System.out.print("Masukkan jumlah item: ");
        int jumlahItems = scanner.nextInt();
        scanner.nextLine();  // Mengonsumsi karakter 'newline'

        Item[] items = new Item[jumlahItems];  // Array untuk items
        for (int i = 0; i < jumlahItems; i++) {
            System.out.print("Masukkan nama item ke-" + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Masukkan jumlah untuk item " + name + ": ");
            int quantity = scanner.nextInt();
            scanner.nextLine();  // Mengonsumsi karakter 'newline'
            items[i] = new Item(name, quantity);
        }

        // Input untuk customers
        System.out.print("Masukkan jumlah customer: ");
        int jumlahCustomers = scanner.nextInt();
        scanner.nextLine();  // Mengonsumsi karakter 'newline'

        Customer[] customers = new Customer[jumlahCustomers];  // Array untuk customers
        for (int i = 0; i < jumlahCustomers; i++) {
            System.out.print("Masukkan nama customer ke-" + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Masukkan email untuk customer " + name + ": ");
            String email = scanner.nextLine();
            customers[i] = new Customer(name, email);
        }

        // Menampilkan isi dari array items
        System.out.println("\nDaftar Items:");
        for (Item item : items) {
            item.display();
        }

        // Menampilkan isi dari array customers
        System.out.println("\nDaftar Customers:");
        for (Customer customer : customers) {
            customer.display();
        }
    }
}
