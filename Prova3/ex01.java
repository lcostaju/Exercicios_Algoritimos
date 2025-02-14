package Prova3;

import java.util.Scanner;
import java.util.ArrayList;

public class ex01 {

    public static void menu() {
        String menu = """
                1. Inserir novo Animal
                2. Listar todos os animais
                3. Listar Animais Filhotes (<2 anos)
                4. Buscar Animal pelo nome do Tutor
                5. Apagar Lista
                6. Sair
                """;

        System.out.println(menu);
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

    public static void buscarPorTutor(ArrayList<Animal> animais){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome do Tutor: ");
        String nomeTutor = sc.nextLine();
        boolean found = false;

        for (Animal animal : animais) {
            if (animal.getNomeTutor().equalsIgnoreCase(nomeTutor)) {
                System.out.println(animal);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Nenhum animal encontrado para o tutor: " + nomeTutor);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> animais = new ArrayList<Animal>();
        Animal animal;

        int opcao = 0;

        while (opcao != 6) {
            menu();

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    animal = inserirAnimal();
                    animais.add(animal);
                    break;
                case 2:
                    for (Animal animal2 : animais) {
                        System.out.println(animal2.toString());
                    }
                    break;
                case 3:
                    for (Animal animal3 : animais) {
                        if(animal3.getIdade() < 2){
                            System.out.println(animal3.toString());
                        }
                    }
                    break;
                case 4:
                    buscarPorTutor(animais);
                    break;
                case 5:
                    animais.clear();
                    System.out.println("Lista apagada");
                    break;
                default:
                    break;
            }
        }
    }
}
