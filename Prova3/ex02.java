package Prova3;

import java.util.HashMap;
import java.util.Scanner;

public class ex02 {

    public static int menu(){
        Scanner s = new Scanner(System.in);
        String menu = """
                1. Adcionar Animal
                2. Remover um animal pelo registro
                3. Imprimir todos animais
                """;
        System.out.println(menu);
             return s.nextInt();   
    }

    public static Animal inserirAnimal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.println("Nome do Tutor: ");
        String nomeTutor = sc.nextLine();
        System.out.println("Registro: ");
        String registro = sc.nextLine();

        Animal animal = new Animal(nome, idade, nomeTutor, registro);
        return animal;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        HashMap<String,Animal> animais = new HashMap<>();

        Animal animal;

        String registro;

        int op = 0;

        while (op != 4) {
            op = menu();

            switch (op) {
                case 1:
                    animal = inserirAnimal();
                    animais.put(animal.getRegistro(), animal);
                    break;
                case 2:
                    System.out.println("Informe o registro");
                    registro = s.nextLine();
                    animais.remove(registro);
                    break;
                case 3:
                    for (Animal a : animais.values()) {
                        System.out.println(a.toString());
                    }
                    break;    
                default:
                    break;
            }
        }

    }
}
