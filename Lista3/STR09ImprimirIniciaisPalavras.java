package Lista3;

import java.util.Scanner;

public class STR09ImprimirIniciaisPalavras {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String t = s.nextLine();

        String arrt[] = t.split(" ");

        for (String t1 : arrt) {
            if (t1.length() > 3)
            System.out.println(t1.substring(0,3));
        }

    }
}
