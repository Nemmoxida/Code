package recrusive;

public class jumpSearch {
    public static int Jumpsearch(int[] arr, int x) {
        int n = arr.length;
        int step = (int) Math.floor(Math.sqrt(n));
        return recursiveJumpSearch(arr, x, 0, step, n);
    }

    private static int recursiveJumpSearch(int[] arr, int x, int prev, int step, int n) {
        // Base case: If prev is out of bounds, return -1
        if (prev >= n) {
            return -1;
        }

        // Find the minimum step index
        int minStep = Math.min(step, n) - 1;

        // If the element is found in the current block
        if (arr[minStep] >= x) {
            // Perform linear search within the block
            return linearSearch(arr, x, prev, minStep);
        }

        // Move to the next block
        return recursiveJumpSearch(arr, x, step, step + (int) Math.floor(Math.sqrt(n)), n);
    }

    private static int linearSearch(int[] arr, int x, int start, int end) {
        for (int i = start; i <= end && i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610 };
        int x = 55;

        int index = Jumpsearch(arr, x);

        System.out.println("Number " + x + " is at index " + index);
    }
}