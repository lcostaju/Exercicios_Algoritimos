import java.util.Scanner;
public class App {
    //Usuário passa um vetor de notas e o programa retorna a média
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        double ArrNotas[] = new double[n];

        for (int i = 0; i < ArrNotas.length; i++) {
            ArrNotas[i] = s.nextDouble();
        }

        calculaMedia(ArrNotas);
        s.close();
    }

    public static void calculaMedia(double nVetor[]){
        double total = 0.0;
        double media = 0.0;
        for (int i = 0; i < nVetor.length; i++) {
            total += nVetor[i];
        }

        media = total/nVetor.length;

        System.out.println(media);
    } 
}
