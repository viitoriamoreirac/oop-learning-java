package lista4;

import java.util.Scanner;

class Main {
   public static double calcularArea(double base, double altura) {
       return base * altura;
   }
   public static double calcularPerimetro(double base, double altura) {
       return 2 * (base + altura);
   }


   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int opcao;
       double base, altura, area, perimetro;


       System.out.print("Digite a base do retângulo: ");
       base = scanner.nextDouble();
       System.out.print("Digite a altura do retângulo: ");
       altura = scanner.nextDouble();


       System.out.println("Escolha uma opção:");
       System.out.println("1. Calcular a área do retângulo");
       System.out.println("2. Calcular o perímetro do retângulo");
       opcao = scanner.nextInt();


       switch (opcao) {
           case 1:
               area = calcularArea(base, altura);
               System.out.printf("A área do retângulo é: %.2f%n", area);
               break;
           case 2:
               perimetro = calcularPerimetro(base, altura);
               System.out.printf("O perímetro do retângulo é: %.2f%n", perimetro);
               break;
           default:
               System.out.println("Opção inválida!");
       }
   }
}
