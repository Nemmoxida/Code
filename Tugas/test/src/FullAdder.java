import java.util.Scanner;
import java.util.ArrayList;

public class FullAdder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // the variables for the full adder/logic gate
        boolean firstXor = false;
        boolean secondXor = false;
        boolean firstAnd = false;
        boolean secondAnd = false;
        boolean or = false;
        boolean carryIn = false;
        int sum = 0;

        System.out.println("Enter the first Input");
        String inputOne = input.nextLine();

        System.out.println("Enter the second Input");
        String inputTwo = input.nextLine();

        // Arraylist to store the binary input and result
        ArrayList<Integer> arrayOne = new ArrayList<Integer>();
        ArrayList<Integer> arrayTwo = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();

        // Convert the binary input to array of integers, ignoring spaces
        for (char binary : inputOne.toCharArray()) {
            if (binary != ' ') {
                int binaryInt = Character.getNumericValue(binary);
                arrayOne.add(binaryInt);
            }
        }

        // Convert the binary input to array of integers, ignoring spaces
        for (char binary : inputTwo.toCharArray()) {
            if (binary != ' ') {
                int binaryInt = Character.getNumericValue(binary);
                arrayTwo.add(binaryInt);
            }
        }

        // Get the maximum length of the two arrays
        int maxLength = Math.max(arrayOne.size(), arrayTwo.size());

        // Convert the arraylist to array
        int[] arrayOneArr = arrayOne.stream().mapToInt(i -> i).toArray();
        int[] arrayTwoArr = arrayTwo.stream().mapToInt(i -> i).toArray();

        // Pad the arrays with zeros so that they have the same length
        int[] paddedArrayOne = padArray(arrayOneArr, maxLength);
        int[] paddedArrayTwo = padArray(arrayTwoArr, maxLength);

        // Reverse the padded arrays
        paddedArrayOne = reverseArray(paddedArrayOne);
        paddedArrayTwo = reverseArray(paddedArrayTwo);

        for (int i = 0; i < maxLength; i++) {

            boolean a = paddedArrayOne[i] == 1;
            boolean b = paddedArrayTwo[i] == 1;

            // First XOR gate
            firstXor = a ^ b;

            // Second XOR gate for sumFinal
            secondXor = firstXor ^ carryIn;

            // First AND gate for carry out
            firstAnd = firstXor && carryIn;

            // Second AND gate for carry out
            secondAnd = a && b;

            // OR gate for carry out
            or = (firstAnd || secondAnd);

            sum = secondXor ? 1 : 0;

            result.add(sum);

            if (i == maxLength - 1 && or == true) { // if it's the last digit of the input, and the carry out is true.
                result.add(1); // add 1 to the result
            } else {
                carryIn = or;

            }
        }

        // Pad the result with zeros so that it has a length that is a multiple of 4
        while (true) {
            if (result.size() % 4 == 0) {
                break;
            } else {
                result.add(0);

            }
        }

        // Convert the result arraylist to array
        int[] resultArr = result.stream().mapToInt(i -> i).toArray();

        // Reverse the result array
        resultArr = reverseArray(resultArr);

        for (int i = 0; i < resultArr.length; i++) { // print the result
            if (i > 0 && i % 4 == 0) {  // add space after every 4 digits
                System.out.print(" ");
            }
            System.out.print(resultArr[i]);
        }

        input.close();
    }

    // Method to pad the array with zeros
    private static int[] padArray(int[] array, int length) {
        int[] paddedArray = new int[length];
        System.arraycopy(array, 0, paddedArray, length - array.length, array.length);
        return paddedArray;
    }

    // Method to reverse the array
    private static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }
}