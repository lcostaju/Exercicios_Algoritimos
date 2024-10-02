package Lista1;
import java.util.Scanner;
public class QuadradoPares {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        quadradoPares(1, n);
        s.close();
    }

    public static void quadradoPares(int ini, int n){
        if(ini > n){
            return;
        }
        else{
            
            if (ini %2 == 0) {
                System.out.println(ini+"^2 = "+(ini*ini));
            }
            ini++;
            quadradoPares(ini, n);
        }

    }
}
