package Lista1;
import java.util.Scanner;

public class FibonacciFacil {

    
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        
        if (N > 0 && N < 46) {
            
            for (int i = 0; i < N; i++) {
                System.out.print(fibonacci(i));
                if (i < N - 1) {
                    System.out.print(" ");
                }
            }
        }
    }
}
