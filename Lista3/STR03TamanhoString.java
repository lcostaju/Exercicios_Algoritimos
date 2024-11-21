package Lista3;

import java.util.Scanner;

public class STR03TamanhoString {

    public static String stringSize(String s){
        return s.length() <= 10?"pequeno":"grande";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String text = s.nextLine();

        System.out.println(stringSize(text));
    }
}
