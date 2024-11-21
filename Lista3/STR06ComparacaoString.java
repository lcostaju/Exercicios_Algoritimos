package Lista3;

import java.util.Scanner;
public class STR06ComparacaoString {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String txt = s.nextLine();

        for (int i = 0; i < txt.length(); i++) {
            System.out.println(i+" - "+txt.substring(i, i+1));
        }
    }
}
