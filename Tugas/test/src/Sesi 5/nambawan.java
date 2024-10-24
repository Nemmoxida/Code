import java.util.Scanner;
import java.text.DecimalFormat;

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

public class nambawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Masukkan jumlah data: ");
        int data = input.nextInt();

        input.nextLine(); 
        Student[] students = new Student[data];
        for (int i = 0; i < data; i++) {
            System.out.println("\n-----------------------------");
            System.out.println("Masukkan nama student ke-" + (i + 1) + ": ");
            String name = input.nextLine();
            System.out.println("\n-----------------------------");
            System.out.println("Masukkan nilai untuk student " + name + ": ");
            int nilai = input.nextInt();
            input.nextLine(); 
            students[i] = new Student(name, nilai);
        }

        System.out.println("Daftar Nilai Student");
        System.out.println("========================================");
        System.out.printf("%-4s %-15s %-6s %-10s\n", "No.", "Nama Student", "Nilai", "Status");
        System.out.println("========================================");
        for (int i = 0; i < students.length; i++) {
            String status = students[i].nilai >= 70 ? "Lulus" : "Tidak Lulus";
            System.out.printf("%-4d %-15s %-6d %-10s\n", (i + 1), students[i].name, students[i].nilai, status);
        }
        System.out.println("========================================");

        int jumlahNilai = 0;
        for (int i = 0; i < students.length; i++) {
            jumlahNilai += students[i].nilai;
        }

        System.out.println("Jumlah Nilai: " + jumlahNilai);
        double rataRata = (double) jumlahNilai / students.length;
        System.out.println("Rata-rata Nilai: " +df.format(rataRata) );

        input.close();
    }
}
