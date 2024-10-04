import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int intA = input.nextInt();
        boolean a = (intA == 1);

        System.out.println("Input a : " + a);

        input.close();
    }
}
