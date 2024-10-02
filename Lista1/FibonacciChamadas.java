package Lista1;
import java.util.Scanner;
public class FibonacciChamadas {
    public static int calls;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x;
        int fib;

        for (int i = 0; i < n; i++) {
            x = s.nextInt();
            calls = 0;
            fib = fibonacc(x);
            System.out.println("fib("+x+") = "+(calls-1)+" calls = "+fib);
        }

        s.close();


    }

    public static int fibonacc(int numero){
        calls++;
        // System.out.println("debug"+calls);
        if (numero == 0) {
            return 0;
        }else if(numero==1){
            return 1;
        }else{
            return fibonacc(numero - 1) + fibonacc(numero - 2);
        }
    }

    
}

