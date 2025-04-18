import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;

class Student {
    String name;
    int nilai;

    // Constructor
    Student(String name, int nilai) {
        this.name = name;
        this.nilai = nilai;
    }

    // Method untuk menampilkan informasi Student
    public void display() {
        System.out.println("Student Name: " + name + ", Quantity: " + nilai);
    }    
}

public class nomorSatu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     // Create a Scanner object
        DecimalFormat df = new DecimalFormat("#.##");   // Create a DecimalFormat object

        System.out.println("Masukkan jumlah data: ");   // For input data
        int data = input.nextInt();                       // Data is for defining the number of students 

        input.nextLine();   // Consume the newline character
        ArrayList<Student> students = new ArrayList<>();  // ArrayList of students
        for (int i = 0; i < data; i++) {
            System.out.println("\n-----------------------------");
            System.out.println("Masukkan nama student ke-" + (i + 1) + ": ");
            String name = input.nextLine();
            System.out.println("\n-----------------------------");
            System.out.println("Masukkan nilai untuk student " + name + ": ");
            int nilai = input.nextInt();
            input.nextLine(); 
            students.add(new Student(name, nilai)); // Add a new student object to the ArrayList
        }

        System.out.println("Daftar Nilai Student");
        System.out.println("========================================");
        System.out.printf("%-4s %-15s %-6s %-10s\n", "No.", "Nama Student", "Nilai", "Status");
        System.out.println("========================================");
        for (int i = 0; i < students.size(); i++) {
            String status = students.get(i).nilai >= 70 ? "Lulus" : "Tidak Lulus";  // If nilai >= 70, status is Lulus, else Tidak Lulus
            System.out.printf("%-4d %-15s %-6d %-10s\n", (i + 1), students.get(i).name, students.get(i).nilai, status);
        }
        System.out.println("========================================");

        int jumlahNilai = 0;
        for (int i = 0; i < students.size(); i++) { // Calculate the total nilai
            jumlahNilai += students.get(i).nilai;
        }

        System.out.println("Jumlah Nilai: " + jumlahNilai);
        double rataRata = (double) jumlahNilai / students.size();   // Calculate the average nilai
        System.out.println("Rata-rata Nilai: " + df.format(rataRata));  // Print the average nilai

        input.close();
    }
}
