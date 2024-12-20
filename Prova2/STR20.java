package Prova2;

import java.util.Scanner;

public class STR20 {

    public static int somaDigitos(String palavra) {
        int soma = 0;
        boolean hasNumber = false;
        for (int i = 0; i < palavra.length(); i++) {
            if (Character.isDigit(palavra.charAt(i))) {
                soma += Character.getNumericValue(palavra.charAt(i));
                hasNumber = true;
            }
        }
        return hasNumber ? soma : 1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String frase = s.nextLine();

        String[] palavras = frase.split(" ");
        int resultado = 1;

        for (String palavra : palavras) {
            resultado *= somaDigitos(palavra);
        }

        System.out.println("Resultado = " + resultado);
        s.close();
    }
}