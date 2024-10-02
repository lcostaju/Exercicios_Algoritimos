package Lista1;
import java.util.Scanner;
public class Rec01GerarRepeticao {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int n = s.nextInt();
        s.close();
        repetir(t, n);
    }

    public static void repetir(int t, int n){

        if (n==1) {
            System.out.print(t);
            System.out.println();
            return;
        }else{
            System.out.print(t+"-");
            repetir(t, --n);
        }
    }
}
