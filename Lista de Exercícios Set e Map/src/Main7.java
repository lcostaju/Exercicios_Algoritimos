import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> mapaOriginal = new HashMap<>();
        
        System.out.println("Digite pares de String e Integer (digite 'Fim' para encerrar):");
        
        while (true) {
            String chave = scanner.next();
            if (chave.equalsIgnoreCase("Fim")) {
                break;
            }
            int valor = scanner.nextInt();
            mapaOriginal.put(chave, valor);
        }
        
        Map<Integer, String> mapaInvertido = new HashMap<>();
        for (Map.Entry<String, Integer> entry : mapaOriginal.entrySet()) {
            mapaInvertido.put(entry.getValue(), entry.getKey());
        }
        
        scanner.close();
        
        System.out.println("Mapa invertido: " + mapaInvertido);
    }
}
