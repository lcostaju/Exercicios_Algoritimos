package Lista3;

import java.util.Scanner;

public class STR02CustoMoradia {

    

    public static String custoCidade(String cidade, double custo){

        switch (cidade) {
            case "Uberlandia":
                return String.format("O custo de vida em Uberlandia e R$ %.2f", custo);
            case "Brasilia":
                return String.format("O custo de vida em Brasilia e R$ %.2f", custo * 2.00);
            default:
                return String.format("O custo de vida em %s e R$ %.2f", cidade, custo / 2.00);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double custo = s.nextDouble();
        String cidade = s.next();

        System.out.println(custoCidade(cidade, custo));
    }
}
