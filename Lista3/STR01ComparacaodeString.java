package Lista3;
import java.util.Scanner;

public class STR01ComparacaodeString {
    public static String comparaString(String s1,String s2){
        
        return s1.compareTo(s2) == 0? "correto":"incorreto";

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String s1 = s.nextLine();
        String s2 = s.nextLine();

        System.out.println(comparaString(s1, s2));
    }
}
