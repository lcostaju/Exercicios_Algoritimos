import java.util.Scanner;
public class App {
    public static int calcNumLeds(String s){
        char arrS[] = s.toCharArray();
        int soma = 0;
        int leds[] = {6,2,5,5,4,5,6,3,7,6};
        for (int i = 0; i < arrS.length; i++) {
            soma += leds[arrS[i]-48];
        }
        return soma;
    }
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String num = "";

        for (int i = 0; i < n; i++) {
            num = s.next();
            System.out.println(calcNumLeds(num)+" leds");
        }
    }
}
