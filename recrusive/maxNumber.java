package recrusive;

public class maxNumber {

    private static int max = 0;

    public static int findMax(int arr[], int n){

        if (n == arr.length) {
            return max;
        }
        if (arr[n] > max) {
            max = arr[n];
            
        }
        return findMax(arr, n+1);
        

    }

    public static void main(String[] args) {
        int arr[] = {1, 14, 69, 12, 23, 6, 24, 9, 33};

        int x = 0;
        
        int maxNumber = findMax(arr, x);
        System.out.println("max number is :" + maxNumber);
    }
}
