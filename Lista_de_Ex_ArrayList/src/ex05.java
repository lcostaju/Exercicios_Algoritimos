
import java.util.ArrayList;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<String> listaNomes = new ArrayList<String>();

        System.out.println("Digite Cinco nomes:");
        for (int i = 0; i < 5; i++) {
            listaNomes.add(s.next());
        }

        System.out.println("Qual dos nomes abaixo você deseja excluir da lista?");

        for (int i = 0; i < listaNomes.size(); i++) {
            System.out.println(i+1+". "+listaNomes.get(i));
        }

        System.out.println("Informe o número correspondente ao nome a ser excluído:");
        int removeNum = s.nextInt();
        listaNomes.remove(removeNum - 1);

        System.out.println("Resultado:");
        for (int i = 0; i < listaNomes.size(); i++) {
            System.out.println(i+1+". "+listaNomes.get(i));
        }
    }
}
