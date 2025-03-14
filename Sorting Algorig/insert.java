public class insert {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Geser elemen ke kanan jika lebih besar dari key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2};
        insertionSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}