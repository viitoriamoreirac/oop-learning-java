package lista9.questao1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private static ArrayList <Gerente> gerentes = new ArrayList<>();

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
                    adicionarFuncionario();
                    break;
                case 2:
                    adicionarGerente();
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

    private static void adicionarFuncionario(){
        System.out.println("Nome: ");
        String name = scanner.nextLine();

        System.out.println("CPF: ");
        String cpf = scanner.nextLine();

        System.out.println("Data de nascimento: ");
        String birthDate = scanner.nextLine();

        System.out.println("Salário: ");
        double salary = scanner.nextDouble();

        Funcionario funcionario = new Funcionario(name, cpf, birthDate, salary);

        funcionarios.add(funcionario);
        System.out.println("Funcionário adicionado com sucesso!");
    }

    private static void adicionarGerente() {
        System.out.println("Nome: ");
        String name = scanner.nextLine();

        System.out.println("CPF: ");
        String cpf = scanner.nextLine();

        System.out.println("Data de nascimento: ");
        String birthDate = scanner.nextLine();

        System.out.println("Salário: ");
        double salary = scanner.nextDouble();

        System.out.println("Departamento: ");
        String department = scanner.nextLine();

        Gerente gerente = new Gerente(name, cpf, birthDate, salary, department);

        gerentes.add(gerente);
        System.out.println("Gerente adicionado com sucesso!");
    }
}
