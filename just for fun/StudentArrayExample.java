// Mahasiswa.java
class Mahasiswa {
    String nama;
    int umur;

    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
}

// StudentArrayExample.java
public class StudentArrayExample {
    public static void main(String[] args) {
        Mahasiswa[] mahasiswa = new Mahasiswa[3];
        mahasiswa[0] = new Mahasiswa("Budi", 20);
        mahasiswa[1] = new Mahasiswa("Andi", 21);
        mahasiswa[2] = new Mahasiswa("Caca", 22);

        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Nama Mahasiswa " + (i + 1) + ": " + mahasiswa[i].nama);
            System.out.println("Umur Mahasiswa " + (i + 1) + ": " + mahasiswa[i].umur);
        }
    }
}