package lista4.questao5;

import java.util.Scanner;

class Main {
   public static double fahrenheitParaCelsius(double fahrenheit) {
       return (fahrenheit - 32) * 5 / 9;
   }
   public static double kelvinParaCelsius(double kelvin) {
       return kelvin - 273.15;
   }


   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int opcao;


       do {
           System.out.println("_____________________________________");
           System.out.println("1. Informar temperatura em Fahrenheit");
           System.out.println("2. Informar temperatura em Kelvin");
           System.out.println("0. Sair");
           System.out.print("Escolha uma opção: ");
           opcao = scanner.nextInt();


           switch (opcao) {
               case 1:
                   System.out.print("Digite a temperatura em Fahrenheit: ");
                   double fahrenheit = scanner.nextDouble();
                   double celsiusF = fahrenheitParaCelsius(fahrenheit);
                   System.out.printf("A temperatura em Celsius é: %.2f °C%n", celsiusF);
                   break;


               case 2:
                   System.out.print("Digite a temperatura em Kelvin: ");
                   double kelvin = scanner.nextDouble();
                   double celsiusK = kelvinParaCelsius(kelvin);
                   System.out.printf("A temperatura em Celsius é: %.2f °C%n", celsiusK);
                   break;


               case 0:
                   System.out.println("Saindo...");
                   break;
               default:
                   System.out.println("Opção inválida! Tente novamente.");
           }
       } while (opcao != 0);
       scanner.close();
   }


}
