package Lista1;
import java.util.Scanner;;
public class REC02SomarElementosVetor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(somaVet(arr, 0));
    }

    public static int somaVet(int vet[],int pos){
        
        if (pos == vet.length - 1) {
            return vet[pos];
        }else{
            return vet[pos] + somaVet(vet, ++pos);
        }
    }
}
