import java.util.ArrayList;
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String nome = "", cpf = "";
        Integer idade = 0, op = 0;

        Cliente clienteBusca;

        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

        String menu = """
                1. Inserir novo Cliente
                2. Listar todos os clientes
                3. Buscar Cliente pelo CPF
                4. Remover cliente pelo CPF
                5. Apagar Lista
                6. Sair
                """;

        while (op != 6) {
            System.out.println(menu);
            op = s.nextInt();
            s.nextLine();
            if (op == 1) {
                System.out.println("Nome:");
                nome = s.nextLine();
                System.out.println("CPF:");
                cpf = s.nextLine();
                System.out.println("Idade:");
                idade = s.nextInt();

                listaClientes.add(new Cliente(nome, cpf, idade));
            } else if (op == 2) {
                for (Cliente cliente : listaClientes) {
                    System.out.println("-----------");
                    System.out.println("Nome:");
                    System.out.println(cliente.getNome());
                    System.out.println("CPF:");
                    System.out.println(cliente.getCpf());
                    System.out.println("Idade:");
                    System.out.println(cliente.getIdade());
                    System.out.println("-----------");
                }
            }else if(op == 3){
                System.out.println("Digite o cpf:");
                cpf = s.nextLine();
                clienteBusca = new Cliente(cpf);

                boolean found = false;
                for (Cliente cliente : listaClientes) {
                    if (cliente.getCpf().equals(clienteBusca.getCpf())) {
                        System.out.println("-----------");
                        System.out.println("Cliente encontrado:");
                        System.out.println("Nome: " + cliente.getNome());
                        System.out.println("CPF: " + cliente.getCpf());
                        System.out.println("Idade: " + cliente.getIdade());
                        System.out.println("-----------");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Cliente não encontrado.");
                }
            }else if (op == 4) {
                System.out.println("Digite o cpf:");
                cpf = s.nextLine();
                clienteBusca = new Cliente(cpf);

                boolean removed = false;
                for (Cliente cliente : listaClientes) {
                    if (cliente.getCpf().equals(clienteBusca.getCpf())) {
                        listaClientes.remove(cliente);
                        System.out.println("Cliente removido com sucesso.");
                        removed = true;
                        break;
                    }
                }
                if (!removed) {
                    System.out.println("Cliente não encontrado.");
                }
            }else if(op == 5){
                listaClientes.clear();
                System.out.println("Todos os clientes foram removidos.");
            }
        }
    }
}
