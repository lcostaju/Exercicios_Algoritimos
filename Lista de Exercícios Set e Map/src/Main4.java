import java.util.HashSet;
import java.util.Scanner;


public class Main4 {
    /*
     * Crie um programa em Java que Verifique a existência de uma determinada
     * string dentro de um conjunto:
     * ● Crie um HashSet para armazenar um conjunto de strings. Entre diversas
     * palavras até digitar “fim”.
     * ● Verifique se uma determinada string existe no conjunto.
     * ● Utilize o método contains() para essa verificação.
     * 
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> palavras = new HashSet<String>();
        String palavra = "";

        while (!palavra.equalsIgnoreCase("fim")) {
            palavra = scanner.nextLine();
            if (!palavra.equalsIgnoreCase("fim"))
            palavras.add(palavra);
        }

        System.out.println("Digite a palavra que deseja verificar: ");
        palavra = scanner.nextLine();

        
        if (palavras.contains(palavra)) {
            System.out.println("Existe");
        } else {
            System.out.println("Não existe");
        }
    }
}
