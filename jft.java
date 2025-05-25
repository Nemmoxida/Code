public class jft {
    public static void main (String[] args){
        int x = 1;
        for(int i = 1; i <= 27 ; i++){
            x = 1;
            while (true) {
                
                int hasil = i * x;
                int det = hasil % 27;
                if (det == 1) {
                    System.out.println("det " + i + "  : " + x);
                    break;
                } if (x == 100) {
                    System.out.println("no valid for : " + i);
                    break;
                }
                x++;
            }
            }
        }
    }

