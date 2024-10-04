import java.util.Scanner;

public class FullAdder{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int aInt = 0;
        int bInt = 0;
        int x = 0;
        boolean a = (aInt == 1);   // input a
        boolean b = (aInt == 1);   // input b
        boolean c = false;   // input carry in
        boolean sum1 = true;    // first xor gate
        int sumFinal = 0;   // final sum
        int carryOut = 0;   // carry out
        boolean and1 = true;    // first and gate for carry out
        boolean and2 = true;    // second and gate for carry out

        System.out.println("How many operation do yo need?");
        x = input.nextInt();

        for(int i = 0; i < x ; i++)

        if (a == true && b == true || a == false && b == false) { // first xor gate
            sum1 = false;
        } else {
            sum1 = true;
        }

        if (sum1 == true && c == true || sum1 == false && c == false) { // second xor gate for sumFinal
            sumFinal = 0;

        } else {
            sumFinal = 1;
        }

        if (sum1 == true && c == true) { // first and gate for carry out
            and1 = true;
        } else {
            and1 = false;
        }

        if (a == true && b == true) { // second and gate for carry out
            and2 = true;
        } else {
            and2 = false;
        }

        if (and1 == true || and2 == true) { // carry out
            carryOut = 1;
        } else {
            carryOut = 0;
        }

        System.out.println("Sum : " + sumFinal);
        System.out.println("Carry Out : " + carryOut);
        System.out.println(carryOut + "" + sumFinal);
    }
}