package Lista2;

import java.util.Scanner;

public class SentencaDancante {

    public static String danceSantance(String s) {
        char arrS[] = s.toCharArray();
        String newString = "";
        for (int i = 0; i < arrS.length; i++) {
            if ((i % 2 == 0) || arrS.length == 1) {
                if (arrS[i] >= 'a' && arrS[i] <= 'z') {
                    arrS[i] -= 32;
                }
            }

            newString += arrS[i];
        }

        return newString;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // int n = s.nextInt();
        String jogo = "";
        while (true) {
            jogo = s.nextLine();
            System.out.println(danceSantance(jogo));
        }

    }
}
