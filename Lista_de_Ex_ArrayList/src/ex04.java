import java.util.ArrayList;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> listaConvidados = new ArrayList<String>();
        String convidado = "";
        String convidadoPesq = "";

        while (!convidado.equalsIgnoreCase("fim")) {
            convidado = s.nextLine();

            if(!convidado.equalsIgnoreCase("fim"))
                if (!listaConvidados.contains(convidado))
                listaConvidados.add(convidado);
            else
                System.out.println("convidado existe");
            }
            
        

        System.out.println(listaConvidados.toString().replaceAll(",", "-").replaceAll("[\\[\\]\\s]", ""));

        convidadoPesq = s.nextLine();

        if (listaConvidados.contains(convidadoPesq))
            System.out.println("Existe convidado chamado "+convidadoPesq);
        else
            System.out.println("Não existe convidado chamado "+convidadoPesq);
    }
}
