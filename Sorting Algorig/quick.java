public class quick {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partisi array dan dapatkan indeks pivot
            int pivotIndex = partition(arr, low, high);

            // Rekursif untuk bagian kiri dan kanan
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Pivot adalah elemen terakhir
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Tukar elemen
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Tempatkan pivot di posisi yang benar
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Kembalikan indeks pivot
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2};
        quickSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}