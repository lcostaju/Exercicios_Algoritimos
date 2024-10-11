package Lista1;
import java.util.Scanner;
public class PreenchimentoVetorII {
    // Função recursiva para preencher o vetor e imprimir
    public static void preencherVetor(int[] N, int i, int T) {
        // Condição de parada: se já preenchemos todas as 1000 posições
        if (i == 1000) {
            return;
        }
        
        // Preencher o vetor e imprimir a posição
        N[i] = i % T;
        System.out.println("N[" + i + "] = " + N[i]);
        
        // Chamada recursiva para a próxima posição
        preencherVetor(N, i + 1, T);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ler o valor T
        int T = sc.nextInt();

        // Definir o vetor N com 1000 posições
        int[] N = new int[1000];

        // Iniciar a chamada recursiva para preencher o vetor
        preencherVetor(N, 0, T);

        sc.close();
    }
}
