
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex03 {
    public static Integer somaListArr(ArrayList<Integer> ListaNumeros){
        Integer soma =0;

        for (Integer integer : ListaNumeros) {
            
            soma += integer;
        }
        return soma;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Integer n = s.nextInt();
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            listaNumeros.add(s.nextInt());
        }

        System.out.println(listaNumeros.toString().replaceAll(",", " ").replaceAll("[\\[\\]]", ""));
        System.out.println(somaListArr(listaNumeros));
        System.out.println(Collections.max(listaNumeros));
        listaNumeros.removeIf(numero -> numero % 2 != 0);
        System.out.println(listaNumeros.toString().replaceAll(",", " ").replaceAll("[\\[\\]]", ""));
    }
}
