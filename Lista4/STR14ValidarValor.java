package Lista4;
import java.util.Scanner;

public class STR14ValidarValor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String valor = s.nextLine();

        if (valor.matches("^R\\$\\d{2,6}")) {
            System.out.println("Valor válido");
        } else {
            System.out.println("Valor inválido");
            
        }
    }
}
