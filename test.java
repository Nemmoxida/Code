import java.util.Arrays;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
    //     int[] array1 = {1, 0, 1, 1}; // Array pertama
    //     int[] array2 = {1, 1, 1};    // Array kedua, lebih pendek

    //     // Cari panjang terbesar antara kedua array
    //     int maxLength = Math.max(array1.length, array2.length);

    //     // Tambahkan padding 0 ke depan array yang lebih pendek
    //     int[] paddedArray1 = padArray(array1, maxLength);
    //     int[] paddedArray2 = padArray(array2, maxLength);

    //     // Lakukan operasi AND
    //     int[] result = new int[maxLength];
    //     for (int i = 0; i < maxLength; i++) {
    //         result[i] = paddedArray1[i] & paddedArray2[i];
    //     }

    //     System.out.println("Hasil AND: " + Arrays.toString(result));
    //     System.out.println(Arrays.toString(paddedArray2));
    // }

    // // Fungsi untuk menambahkan padding 0 di depan array
    // private static int[] padArray(int[] array, int length) {
    //     int[] paddedArray = new int[length];
    //     System.arraycopy(array, 0, paddedArray, length - array.length, array.length);
    //     return paddedArray;

    int[] numbers = {1, 1, 0, 1};
        
    // Menentukan panjang array
    int n = numbers.length;
    
    // Menggunakan loop untuk menukar elemen
    for (int i = 0; i < n / 2; i++) {
        int temp = numbers[i];
        numbers[i] = numbers[n - i - 1];
        numbers[n - i - 1] = temp;
    }
    
    // Menampilkan hasil array yang telah dibalik
    System.out.print("Array yang dibalik: ");
    for (int num : numbers) {
        System.out.print(num);
    }

    }

}
