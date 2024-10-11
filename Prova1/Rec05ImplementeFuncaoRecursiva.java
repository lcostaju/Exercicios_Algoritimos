package Prova1;
import java.util.Scanner;

public class Rec05ImplementeFuncaoRecursiva {

    public static int funccaoRecur(int m,int n) {
        if(n == 1){
            return m + 1; 
        }else if(m == 1){
            return n + 1;
        }else if(m<1 || n<1){
            return 0;
        }else{
            return funccaoRecur(m, n-1) + funccaoRecur(m-1, n);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        System.out.println("h("+m+","+n+") = "+funccaoRecur(m, n));
        s.close();
    }
}
