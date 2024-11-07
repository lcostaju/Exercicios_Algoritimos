package Lista2;
import java.util.Scanner;


public class JogoMatematicoPaula {
    public static int jogoPaula(String s){
        char arrStr[] = s.toCharArray();
        int result = 0;
        if(arrStr[0] == arrStr[2]){
            result = (arrStr[0]-48) * (arrStr[2]-48);
        }else if(arrStr[1] >= 'A' && arrStr[1] <= 'Z'){
            result = (arrStr[2]-48) - (arrStr[0]-48);
        }else if(arrStr[1] >= 'a' && arrStr[1] <= 'z'){
            result = (arrStr[0]-48) + (arrStr[2]-48);
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String jogo = "";

        for (int i = 0; i < n; i++) {
            jogo = s.next();
            System.out.println(jogoPaula(jogo));
        }
    }
}
