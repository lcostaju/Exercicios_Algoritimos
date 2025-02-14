import java.util.HashSet;
import java.util.Scanner;
public class main2 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<Integer> numeros1 = new HashSet<>();
        HashSet<Integer> numeros2 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        int num = 0;

        System.out.println("Digite os números do primeiro conjunto: ");
        while (num >= 0) {
            num = scanner.nextInt();
            if (num >= 0)
            numeros1.add(num);
        }

        System.out.println("Digite os números do segundo conjunto: ");
        num = 0;
        while (num >= 0) {
            num = scanner.nextInt();
            if (num >= 0)
            numeros2.add(num);
        }

        for (Integer integer : numeros1) {
            if(!numeros2.add(integer)){
                result.add(integer);
            }
        }

        for (Integer integer : result) {
            System.out.print(integer);
        }

    }
}
