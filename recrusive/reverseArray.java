package recrusive;
import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the number you want to reverse");
        int length =  input.nextInt();
        reverse(length);

        input.close();
    }

    public static void reverse(int n){
        if (n <= 0) {
            return;
        }
        int j = n;
        System.out.print(j + " ");
        n--;
        reverse(n);

    }
}
