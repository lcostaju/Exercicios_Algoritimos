import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        double nota1 = s.nextDouble();
        double nota2 = s.nextDouble();

        maiorNota(nota1, nota2);

        //
        int idade = s.nextInt();
        //
        
        s.close();

    }

    public static double maiorNota( double n1,double n2){
        double maior = Math.max(n1,n2);
        
        return maior;
    }
}
