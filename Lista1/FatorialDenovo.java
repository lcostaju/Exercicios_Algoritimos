package Lista1;
import java.util.Scanner;
public class FatorialDenovo {
    
    public static int fatorial(int n) {
        if(n == 0 || n== 1){
            return 1;
        }else{
            
            return n * fatorial(n-1);
        }
    }

    public static int acm(String in,int tamanho,int aux) {
        if(tamanho == in.length()){
            //return Integer.parseInt(in.substring(in.length() -1 ,in.length())) * 1;
            return 0;
        }else{
            
            return Integer.parseInt(in.substring(tamanho ,tamanho + 1)) * fatorial(aux) + acm(in, tamanho + 1,aux -1);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String in = s.nextLine();
        if(!in.equals("0"))
        System.out.println( acm(in, 0,in.length()));
    }
}
