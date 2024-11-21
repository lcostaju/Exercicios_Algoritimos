package Lista3;

import java.util.Scanner;

public class STR04ValidarTamanhoCPF {

    public static String stringSize(String s){
        return s.length() == 11?"valido":"invalido";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String cpf = s.nextLine();

        System.out.println(stringSize(cpf));
    }
}
