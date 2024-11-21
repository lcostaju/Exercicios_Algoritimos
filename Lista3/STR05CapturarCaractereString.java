package Lista3;

import java.util.Scanner;

public class STR05CapturarCaractereString {

    public static String capturaChar(String s){

        if (s.length() < 5) {
            return "invalida";
        }else if (s.substring(0,1).equals(s.substring(s.length()-1))) {
            return  "iguais";
        }else{
            return "diferentes";
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String txt = s.nextLine();

        System.out.println(capturaChar(txt));

    }
}
