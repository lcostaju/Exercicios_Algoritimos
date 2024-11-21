package Lista3;

import java.util.Scanner;

public class STR08ContarOcorrenciasPalavras {
    
    public static int countPalavra(String palavra1, String palavra2){
        String s[] = palavra1.split(" ");
        int cont = 0;

        for (String p : s) {
            if (p.contains(palavra2))
            cont++;
        }

        return cont;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String palavra1 = s.nextLine();
        String palavra2 = s.nextLine();

        System.out.println(countPalavra(palavra1, palavra2));
    }
}
