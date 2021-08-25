import java.util.Scanner;

public class snt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        while(t > 0) {
            int n = input.nextInt();

            boolean kt = true;

            for(int i=2; i<=Math.sqrt(n); i++) {
                if(n % i == 0) {
                    kt = false;
                    break;
                }
            }

            if(kt) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            t--;
        }
    }
}
