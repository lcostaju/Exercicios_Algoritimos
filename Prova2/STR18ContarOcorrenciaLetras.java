package Prova2;

import java.util.Scanner;

public class STR18ContarOcorrenciaLetras {
    public static int contarOcorrenciaLetras(String texto, char letra) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == letra) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String texto = s.nextLine();
        char letra1 = s.next().charAt(0);
        char letra2 = s.next().charAt(0);

        int contador1 = contarOcorrenciaLetras(texto, letra1);
        int contador2 = contarOcorrenciaLetras(texto, letra2);

        if (contador1 > contador2) {
            System.out.println(letra1);
        } else if (contador1 < contador2) {
            System.out.println(letra2);
        } else {
            System.out.println("empate");
        }

    }
}
