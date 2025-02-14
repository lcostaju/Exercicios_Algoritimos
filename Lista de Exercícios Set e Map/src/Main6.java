import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> mapaDeOcorrencias = new HashMap<>();

        System.out.println("Digite números inteiros (digite um número negativo para encerrar):");
        
        while (true) {
            int numero = scanner.nextInt();
            if (numero < 0) {
                break;
            }
            
            mapaDeOcorrencias.put(numero, mapaDeOcorrencias.getOrDefault(numero, 0) + 1);
        }
        
        scanner.close();
        
        System.out.println("Ocorrências dos números:");
        for (Map.Entry<Integer, Integer> entry : mapaDeOcorrencias.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
