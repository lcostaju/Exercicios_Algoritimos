package Prova1;
import java.util.Scanner;
public class Rec07SomaRecursivaDigitos {

    public static int somaRecur(int n) {
        if(n<10){
            return n;
        }else{
            return somaRecur(n%10+somaRecur(n/10));
        }
        
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        System.out.println(somaRecur(n));
        s.close();
    }
}
