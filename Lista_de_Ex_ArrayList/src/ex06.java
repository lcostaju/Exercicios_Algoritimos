import java.util.ArrayList;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<Contato> listaContatos = new ArrayList<Contato>();

        String menu = "1. Inserir contato\n2.Listar contatos\n3.Sair";

        String nome = "", telefone = "", celular = "", email = "";

        int op = 0;

        while (op != 3) {
            System.out.println(menu);
            op = s.nextInt();
            s.nextLine();
            if (op == 1) {
                System.out.println("Nome:");
                nome = s.nextLine();
                System.out.println("Telefone:");
                telefone = s.nextLine();
                System.out.println("Celular:");
                celular = s.nextLine();
                System.out.println("Email:");
                email = s.nextLine();
                listaContatos.add(new Contato(nome, telefone, celular, email));
            } else if (op == 2) {
                for (Contato contato : listaContatos) {
                    System.out.println("-----------");
                    System.out.println("Nome:");
                    System.out.println(contato.getNome());
                    System.out.println("Telefone:");
                    System.out.println(contato.getTelefone());
                    System.out.println("Celular:");
                    System.out.println(contato.getCelular());
                    System.out.println("Email:");
                    System.out.println(contato.getEmail());
                    System.out.println("-----------");
                }
            }
        }
    }
}
