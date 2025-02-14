import java.util.HashSet;
import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Aluno> alunos = new HashSet<>();

        String matricula = "";
        String nome = "";

        while (true) {
            System.out.println("Digite a matrícula do aluno: ");
            matricula = scanner.nextLine();
            if (matricula.equals("0")) {
                break;
            }
            System.out.println("Digite o nome do aluno: ");
            nome = scanner.nextLine();
            alunos.add(new Aluno(matricula, nome));
        }
        System.out.println("Alunos");
        for (Aluno aluno : alunos) {
            System.err.println(aluno.getNome());
        }
    }
}
