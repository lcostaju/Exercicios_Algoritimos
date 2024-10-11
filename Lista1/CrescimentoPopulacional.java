package Lista1;

import java.util.Scanner;

public class CrescimentoPopulacional {

    // Função recursiva para calcular o número de anos até que PA ultrapasse PB
    public static int calcularAnos(int PA, int PB, double G1, double G2, int anos) {
        // Condição de parada para evitar mais de 100 anos
        if (anos > 100) {
            return -1; // Representa "Mais de 1 seculo"
        }

        // Se a população de A já ultrapassou ou igualou a de B
        if (PA > PB) {
            return anos;
        }

        // Crescimento populacional anual
        PA += (int) (PA * (G1 / 100.0));
        PB += (int) (PB * (G2 / 100.0));

        // Chamada recursiva para o próximo ano
        return calcularAnos(PA, PB, G1, G2, anos + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();  // Número de casos de teste

        for (int i = 0; i < T; i++) {
            int PA = sc.nextInt();   // População de A
            int PB = sc.nextInt();   // População de B
            double G1 = sc.nextDouble();  // Taxa de crescimento de A
            double G2 = sc.nextDouble();  // Taxa de crescimento de B

            // Chamar a função recursiva
            int anos = calcularAnos(PA, PB, G1, G2, 0);

            // Verifica se foi mais de 1 século
            if (anos == -1) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(anos + " anos.");
            }
        }

        sc.close();
    }
}
