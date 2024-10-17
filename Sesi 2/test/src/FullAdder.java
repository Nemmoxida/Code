import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class FullAdder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
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

        ArrayList<Integer> arrayOne = new ArrayList<Integer>();
        ArrayList<Integer> arrayTwo = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (char binary : inputOne.toCharArray()) {
            int binaryInt = Character.getNumericValue(binary);
            arrayOne.add(binaryInt);
        }


        for (char binary : inputTwo.toCharArray()) {
            int binaryInt = Character.getNumericValue(binary);
            arrayTwo.add(binaryInt);
        }

        int maxLength = Math.max(arrayOne.size(), arrayTwo.size());

        int[] arrayOneArr = arrayOne.stream().mapToInt(i -> i).toArray();
        int[] arrayTwoArr = arrayTwo.stream().mapToInt(i -> i).toArray();

        int[] paddedArrayOne = padArray(arrayOneArr, maxLength);
        int[] paddedArrayTwo = padArray(arrayTwoArr, maxLength);

        // Reverse the padded arrays
        paddedArrayOne = reverseArray(paddedArrayOne);
        paddedArrayTwo = reverseArray(paddedArrayTwo);
        System.out.println(Arrays.toString(paddedArrayOne));
        System.out.println(Arrays.toString(paddedArrayTwo));


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

            if (i == maxLength - 1 && or == true) {
                result.add(1);
            } else {
                carryIn = or;
                
            }
        }

        int[] resultArr = result.stream().mapToInt(i -> i).toArray();
        resultArr = reverseArray(resultArr);
        System.out.println(Arrays.toString(resultArr));
        input.close();
    }

    private static int[] padArray(int[] array, int length) {
        int[] paddedArray = new int[length];
        System.arraycopy(array, 0, paddedArray, length - array.length, array.length);
        return paddedArray;
    }

    private static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }
}