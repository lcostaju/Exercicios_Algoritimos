package Lista1;
import java.util.Scanner;
public class SeisNumerosImpares {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        impares(x, 0);

        s.close();
    }
    public static void impares(int x , int cont){
        if(cont == 6){
            return;
        }else{

            if (x %2 != 0) {
                System.out.println(x);
                cont++;
            }

            impares(x+1, cont);
        }

    }
}
