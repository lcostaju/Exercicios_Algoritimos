package Lista2;

import java.util.Scanner;

public class CifraCesar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o número de casos de teste
        int N = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        for (int i = 0; i < N; i++) {
            // Lê a string codificada
            String textoCodificado = scanner.nextLine();
            // Lê o número de posições de deslocamento
            int deslocamento = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            // Decodifica a string e imprime o resultado
            System.out.println(decodificar(textoCodificado, deslocamento));
        }

        scanner.close();
    }

    // Método para decodificar a string
    public static String decodificar(String textoCodificado, int deslocamento) {
        StringBuilder textoOriginal = new StringBuilder();

        for (char c : textoCodificado.toCharArray()) {
            // Desloca a letra para trás no alfabeto
            char letraOriginal = (char) (c - deslocamento);

            // Caso saia antes do 'A', ajusta para o final do alfabeto
            if (letraOriginal < 'A') {
                letraOriginal += 26;
            }

            textoOriginal.append(letraOriginal);
        }

        return textoOriginal.toString();
    }
}

