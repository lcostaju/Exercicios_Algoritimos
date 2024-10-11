package Prova1;
import java.util.Scanner;
public class Rec04SomaDeImpares {

    public static int somaImpar(int n,int ini) {
        if(ini > n){
            
            return 0;
        }else{
            if (ini % 2 == 0) {
                return somaImpar(n,ini + 1);
            }else{
                if(ini == 1)
                System.out.print(ini+" ");
                else
                System.out.print("+ "+ini+" ");
                return ini + somaImpar(n,ini + 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("= "+somaImpar(n,1));

        s.close();
    }
}
