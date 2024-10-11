import java.util.Scanner;

public class FullAdder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int aInt = 0; // input a
        int bInt = 0; // input b
        int Op = 0; // how much time you want to do the calculation
        boolean a = (aInt == 1); // input a
        boolean b = (aInt == 1); // input b
        boolean c = false; // input carry in
        boolean sum1 = false; // first xor gate
        int sumFinal = 0; // final sum
        int carryOut = 0; // carry out
        boolean and1 = false; // first and gate for carry out
        boolean and2 = false; // second and gate for carry out
        boolean carryOutFinal = false;  // carry out final for the last digit of binary
        String opLegth = Integer.toString(Op); // convert Op to string so it can be used for array
        int[] sumArray = new int[opLegth.length()]; // final summary of the binary number, the legth is determine by opLegth

        System.out.println("How many operation do yo need?");
        Op = input.nextInt();

        System.out.println(Op);
        System.out.println(opLegth);

        for (int i = 0; i < Op; i++) {
            System.out.println("first input :");
            aInt = input.nextInt();

            System.out.println("second input");
            bInt = input.nextInt();


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

            if (i == Op && carryOut == 1) {
                carryOutFinal = true;
            }

            sumArray[opLegth.length() - 1 - i] = sumFinal; // convert the sumFinal to array
        }

        System.out.println(sumArray);

        input.close();
    }
}