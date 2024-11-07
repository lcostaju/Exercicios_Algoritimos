package Lista2;

import java.util.Scanner;

public class Criptografia {
    public static String stringMais3(String s){
        String novaString = "";
        char arrStr[] = s.toCharArray();
        int possAscci = 0;
        for (int i = 0; i < arrStr.length; i++) {
            possAscci = arrStr[i];
            if((possAscci >= 97 && possAscci <= 122) || (possAscci >= 65 && possAscci <= 90)){
                arrStr[i] += 3;
            }
            novaString += arrStr[i];
        }
        return novaString;
    }
    //
    public static String invertString(String s) {
        String noString = "";
        char arrStr[] = s.toCharArray();
        //System.out.println();
        for (int i = arrStr.length-1; i >= 0; i--) {
            noString+=arrStr[i];
        }
        return noString;
    }
    //
    public static String stringMais1(String s){
        String novaString = "";
        char arrStr[] = s.toCharArray();
        int possAscci = 0;
        for (int i = 0; i < arrStr.length; i++) {
            possAscci = arrStr[i];
            if(i >= (arrStr.length/2)){
                arrStr[i] -= 1;
            }
            novaString += arrStr[i];
        }
        return novaString;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        String texto = "";

        for (int i = 0; i < n; i++) {
            texto = s.nextLine();
            System.out.println(stringMais1(invertString(stringMais3(texto))));
        }

        s.close();
    }
}
