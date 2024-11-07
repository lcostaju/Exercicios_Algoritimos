package Lista2;
import java.util.Scanner;
public class EncaixaOuNao {

    public static String encaixaOuNao(String s1,String s2){
        String newS1 = "";

        if(s2.length() > s1.length())
        return "nao encaixa";

        for (int i = ((s1.length() - 1)-(s2.length()-1)); i <s1.length(); i++) {
            newS1 += s1.charAt(i);
        }

        if(!s2.equals(newS1))
        return "nao encaixa";
        else
        return "encaixa";
        
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1,s2;
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            s1 = s.next();
            s2 = s.next();

            System.out.println(encaixaOuNao(s1, s2));
        }
    }
}
