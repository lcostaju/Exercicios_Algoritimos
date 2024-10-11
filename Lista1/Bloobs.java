package Lista1;
import java.util.Scanner;



public class Bloobs {
    public static int calcDias(double c){
        if(c <= 1){
            return 0;
        }else{
            c = (c - (c/2));
            return 1 + calcDias(c);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double c;

        for (int i = 0; i < n; i++) {
            c= s.nextDouble();
            System.out.println(calcDias(c) + " dias");
        }
    }
}
