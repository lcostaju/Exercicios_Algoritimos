    import java.util.ArrayList;

    import java.util.Collections;
    import java.util.Scanner;

    public class ex02 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            ArrayList<String> listaNomes = new ArrayList<String>();
            

            String nome = "";

            while (!nome.equalsIgnoreCase("fim")) {
                nome = s.nextLine();

                if (!nome.equalsIgnoreCase("fim")) {
                    listaNomes.add(nome);
                }
            }

            Collections.reverse(listaNomes);

            for (String string : listaNomes) {
                System.out.println(string);
            }
        }
    }
