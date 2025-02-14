import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros1 = new ArrayList<Integer>();
        HashSet<Integer> numeros2 = new HashSet<Integer>();
        List<Integer> result = new ArrayList<Integer>();

        int num = 0;

        while (num >= 0) {
            System.out.println("Digite um número: ");
            num = scanner.nextInt();
            if (num >= 0)
                numeros1.add(num);
        }

        for (Integer integer : numeros1) {
            numeros2.add(integer);
        }

        for (Integer integer : numeros2) {
            result.add(integer);
        }

        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
    }
}
