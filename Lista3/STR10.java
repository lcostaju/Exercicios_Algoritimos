package Lista3;

import java.util.Scanner;

public class STR10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String s1 = s.nextLine();
        String s2 = s.nextLine();

        if(s1.indexOf(s2) != -1)
        System.out.println(s1.substring(s1.indexOf(s2)));
        else
        System.out.println(s1);
    }
}
