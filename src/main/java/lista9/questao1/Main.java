package lista9.questao1;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args){
        int option;
        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Adicionar Funcionário");
            System.out.println("2. Adicionar Gerente");
            System.out.println("3. Obter salário de um Funcionário");
            System.out.println("4. Obter salário de um Gerente");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    System.out.println("teste 1");
                    break;
                case 2:
                    System.out.println("teste 2");
                    break;
                case 3:
                    System.out.println("teste 3");
                    break;
                case 4:
                    System.out.println("teste 4");
                    break;
                case 0:
                    System.out.println("ENCERRANDO SESSÃO.");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            } 
       } while (option != 0); 
       scanner.close();
    }
}
