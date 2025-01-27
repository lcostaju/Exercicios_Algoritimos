import java.util.ArrayList;

import java.util.Scanner;
public class App {

    public static Integer somaListArr(ArrayList<Integer> ListaNumeros){
        Integer soma =0;

        for (Integer integer : ListaNumeros) {
            
            soma += integer;
        }
        return soma;
    }
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        ArrayList<Integer> ListaNumeros = new ArrayList<Integer>();
        Integer num = 0;

        while (num >= 0) {
            num = s.nextInt();

            if(num >= 0)
            ListaNumeros.add(num);
        }

        System.out.println(ListaNumeros.size());
        System.out.println("soma = "+somaListArr(ListaNumeros));
    }
}
