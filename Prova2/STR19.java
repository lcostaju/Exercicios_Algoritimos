package Prova2;

import java.util.Scanner;

public class STR19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String l = s.nextLine();

        char c = s.next().charAt(0);

        int quantidade = 0;
        StringBuilder frase = new StringBuilder();

        String[] palavras = l.split(" ");
        for (String palavra : palavras) {
            if (palavra.toLowerCase().contains(Character.toString(c).toLowerCase())) {
                frase.append(palavra).append(" ");
                for (char ch : palavra.toCharArray()) {
                    if (Character.toLowerCase(ch) == Character.toLowerCase(c)) {
                        quantidade++;
                    }
                }
            }
        }

        System.out.println(quantidade);
        System.out.println(frase.toString().trim());

        s.close();
    }
}