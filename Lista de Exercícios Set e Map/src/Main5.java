
import java.util.HashSet;
import java.util.Scanner;



public class Main5 {
    public static void menu(){
        System.out.println("1 - Adicionar convidado");
        System.out.println("2 - Remover um convidado");
        System.out.println("3 - Verifique se um convidado está na lista");
        System.out.println("4 - Exibir todos os convidados");
        System.out.println("5 - Imprimir a quantidade de convidados cadastrados.");
        System.out.println("6 - Apagar todos os convidados.");
        System.out.println("7 - Sair");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String convidado = "";
        int opcao = 0;

        HashSet<String> listaConvidados = new HashSet<String>();


        while (opcao != 7) {
            menu();
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do convidado: ");
                    convidado = scanner.nextLine();
                    listaConvidados.add(convidado);
                    break;
                case 2:
                    System.out.println("Digite o nome do convidado que deseja remover: ");
                    convidado = scanner.nextLine();
                    listaConvidados.remove(convidado);
                    break;
                case 3:
                    System.out.println("Digite o nome do convidado que deseja verificar: ");
                    convidado = scanner.nextLine();
                    if (listaConvidados.contains(convidado)) {
                        System.out.println("Existe");
                    } else {
                        System.out.println("Não existe");
                    }
                    break;
                case 4:
                    for (String string : listaConvidados) {
                        System.out.println(string);
                    }
                    break;
                case 5:
                    System.out.println("Quantidade de convidados: " + listaConvidados.size());
                    break;
                case 6:
                    listaConvidados.clear();
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
