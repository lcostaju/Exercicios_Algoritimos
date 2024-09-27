
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a posição da série de fibonacci?");
        int n = s.nextInt();
        int r = calcularFib(n);  
        System.out.println("O valor da posição " + n + " é " + r);  
        s.close();    
    }

    public static int calcularFib(int n){
       if (n==0){
            return 0;
       }else if (n==1){
            return 1;
       }else{
            return calcularFib(n-1) + calcularFib(n-2);
       }
    }
}
