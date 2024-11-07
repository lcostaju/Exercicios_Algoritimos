package Lista2;
import java.util.Scanner;

public class UmDoisTres {
    public static int umDoisTres(String numero) {
        String one = "one";
        String two = "two";
        String three = "three";
        int cont = 0;

        //Verificar se é one
        for (int i = 0; i < one.length(); i++) {
            if (numero.charAt(i)==one.charAt(i)) {
                cont++;
            }
        }
        
        if(cont >= 2)
        return 1;
        cont = 0;
        for (int i = 0; i < two.length(); i++) {
            if (numero.charAt(i)==two.charAt(i)) {
                cont++;
            }
        }
        
        if(cont >= 2)
        return 2;
        cont = 0;
        for (int i = 0; i < three.length(); i++) {
            if (numero.charAt(i)==three.charAt(i)) {
                cont++;
            }
        }
        
        if(cont >= 4)
        return 3;
                
        return cont;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        String numero = "";

        for (int i = 0; i < n; i++) {
            numero = s.next();
            System.out.println(umDoisTres(numero));
        }
    }
}
