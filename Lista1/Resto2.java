package Lista1;
import java.util.Scanner;
public class Resto2 {

    public static void verificaPar(int n,int cont ) {
        if( cont > 10000){
            return;
        }else{
            if (cont %n == 2) {
                System.out.println(cont);
            }
            verificaPar(n, cont + 1);
            
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        verificaPar(n, 1);
        s.close();
    }
}
