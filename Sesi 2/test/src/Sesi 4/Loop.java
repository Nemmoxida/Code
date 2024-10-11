

public class Loop {
    public static void main(String[] args) {
        int a = 20;

        // first loop
        System.out.println("First loop");
        System.out.print(a + " ");
        while (true) {
            a -= 3;
            System.out.print(a + " ");
            if (a <= 3) {
                break;
            }
        }

        // second loop
        System.out.println("\n\nSecond loop");
        int b = 5;
        System.out.print(b + " ");
        while (true) {
            b += 5;
            System.out.print(b + " ");
            if (b >= 35) {
                break;
            }
        }

        // third loop
        System.out.println("\n\nThird loop");
        int c = 1;
        int d = 0;
        System.out.print(c + " ");
        while(true){
            c += d;
            d++;
            System.out.print(c + " ");
            if (c >= 29) {
                break;
            }
        }

        // fouth loop
        int e = 1;
        int f = 0;

        System.out.println("\n\nFourth loop");
        while (true) {
            int g = e + f;
            System.out.print(g + " ");

            e = f;
            f = g;

            if (g >= 50) {
                break;
            }
        }
    }
}
