package Prova1;

import java.util.Scanner;

public class Rec06CorrigirFuncaoRecursivaFf {
    //
    private static int funcaoFF(int n) {
        // A função está sempre chamando a si mesma em todas as condições, desta forma
        // nunca irá ter uma parada
        if (n <= 1) {// Como o decremento é feito por uma divisão, pode ser que o valor passe por 1 e
                     // não seja validado aqui
            // return funcaoFF(n-1);
            return 1;
        } else if (n % 2 == 0) {

            return funcaoFF(n / 2);
        } else {
            return funcaoFF((n - 1) / 2) + funcaoFF((n + 1) / 2);
        }
    }
    //

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("ff(" + n + ") = " + funcaoFF(n));
        s.close();
    }
}
