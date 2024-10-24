
public class anotherLoop {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;

        while (true) {
            int c = a * b;
            System.out.println(a + " x " + b + " = " + c);

            a++;
            b++;
            if (c == 100) {
                break;
            }
        }
    }
}
