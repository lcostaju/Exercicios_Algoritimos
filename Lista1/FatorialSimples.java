package Lista1;
import java.util.Scanner;

public class FatorialSimples {

    public static int fatorial(int n) {
        if(n == 0 || n== 1){
            return 1;
        }else{
            
            return n * fatorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fatorial(n));
    }
}
