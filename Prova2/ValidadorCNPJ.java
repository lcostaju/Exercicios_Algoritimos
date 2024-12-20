package Prova2;

import java.util.Scanner;

public class ValidadorCNPJ {

    public static boolean isCNPJValido(String cnpj) {
        
        String cnpjNumerico = cnpj.replaceAll("[^\\d]", "");

        
        if (cnpjNumerico.length() != 14) {
            return false;
        }

        
        return cnpj.matches("\\d{14}") || cnpj.matches("\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String cnpj = s.nextLine();

        if (isCNPJValido(cnpj)) {
            System.out.println("CNPJ válido");
        } else {
            System.out.println("CNPJ inválido");
        }

        s.close();
    }
}