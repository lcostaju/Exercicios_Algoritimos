package Lista1;
import java.util.Scanner;
public class SequenciaNumerosSoma {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int maior;
        int menor;
        int soma = 0;

        while ((m > 0)&&(n > 0)) {
            if(m > n){
                maior = m;
                menor = n;
            }else{
                maior = n;
                menor = m;
            }
            soma = calculaSeq(menor,maior);
            System.out.println("Sum="+soma);
            m = s.nextInt();
            n = s.nextInt();

        }
        s.close();
    }
    public static int calculaSeq(int min,int max) {
        if(min > max){
            return 0;
        }else{
            System.out.print(min+" ");
            return min + calculaSeq(min + 1, max);
        }
    }
}
