import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] array1 = {1, 0, 1, 1}; // Array pertama
        int[] array2 = {1, 1, 1};    // Array kedua, lebih pendek

        // Cari panjang terbesar antara kedua array
        int maxLength = Math.max(array1.length, array2.length);

        // Tambahkan padding 0 ke depan array yang lebih pendek
        int[] paddedArray1 = padArray(array1, maxLength);
        int[] paddedArray2 = padArray(array2, maxLength);

        // Lakukan operasi AND
        int[] result = new int[maxLength];
        for (int i = 0; i < maxLength; i++) {
            result[i] = paddedArray1[i] & paddedArray2[i];
        }

        System.out.println("Hasil AND: " + Arrays.toString(result));
        System.out.println(Arrays.toString(paddedArray2));
    }

    // Fungsi untuk menambahkan padding 0 di depan array
    private static int[] padArray(int[] array, int length) {
        int[] paddedArray = new int[length];
        System.arraycopy(array, 0, paddedArray, length - array.length, array.length);
        return paddedArray;
    }
}
