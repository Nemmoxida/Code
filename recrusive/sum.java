package recrusive;

public class sum {
    public static void main(String[] args) {
        int n = 5;
        int sum = Sum(n);
        System.out.println("\nsum of n is : " + sum);
    }

    public static int Sum(int n){
        if (n <= 1) {
            System.out.print(n);
            return 1;
            
        }
        System.out.print(n + " * ");

        return n * Sum(n-1);
    }
}
