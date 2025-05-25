package recrusive;

import java.util.ArrayList;
import java.util.Scanner;

public class sumThree {
    private static ArrayList<Integer> fibo = new ArrayList<>();

    public static int FibonaciSeq(int length, int n, int j, int g) {
        if (length == 1) { // if the leght is 1 then just return the n or the first argument
            return n;
        }
        if (length == 2) { // if the length is 2 then return the second argument
            return j;
        }
        if (length == 3) { // if the length is 3 then return the third argument
            return g;
        }
        int temp; // temp for storing the sum of n and j

        temp = n + j + g;

        n = temp; // n is now the sum of n and j
        fibo.add(temp); // add the sum to the arraylist

        if (length == 0) { // if the length is 0 then return the sum
            return temp;
        }
        length--; // decrement the length
        return FibonaciSeq(length, j, g, n); // reqrusive call to the method
        // the order of the variable is n,j,g
        // after the first call the order will be j,g,n
        // so in other word
        // j = n
        // g = j
        // n = g

    }

    public static void main(String[] args) {
        System.out.println("search for value of n sequence");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        System.out.println("Enter the first two numbers of the sequence");
        System.out.print("a: ");
        int x = input.nextInt();
        System.out.print("b: ");
        int y = input.nextInt();
        System.out.print("c: ");
        int z = input.nextInt();
        fibo.add(x);
        fibo.add(y);
        fibo.add(z);
        int Sequence = FibonaciSeq(length, x, y, z);

        System.out.println("Sequence of an n :" + Sequence);
        System.out.println(fibo); // print the array that contain the sequence
        input.close();
    }
}
