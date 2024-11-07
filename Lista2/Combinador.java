package Lista2;

import java.util.Scanner;

public class Combinador {
    public static String combinaString(String s1,String s2){
        String newString = "";
        int maxI = Math.max(s1.length(),s2.length());

        for (int i = 0; i < maxI; i++) {
            if (i < s1.length()) {
                newString += s1.charAt(i);
            }

            if(i < s2.length()){
                newString += s2.charAt(i);
            }
        }

        return newString;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1;
        String s2;
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            s1 = s.next();
            s2 = s.next();
            System.out.println(combinaString(s1, s2));
        }
    }
}
