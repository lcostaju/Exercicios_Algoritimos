package Lista1;
import java.util.Scanner;
public class ContarDigitos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    String n = s.nextLine();
    int d = s.nextInt();
    s.close();
    int soma = qtdDigitos(d, n, 0);

    System.out.println(soma);
    }
    
    public static int qtdDigitos(int digito, String s, int con ) {
        if(con == s.length()){
            return 0;
        }else{
            if(Integer.parseInt(s.substring(con ,con +1)) == digito){
                return 1 + qtdDigitos(digito, s, con+1);
            }else{
                return qtdDigitos(digito, s, con + 1);
            }
        }
    }
}
