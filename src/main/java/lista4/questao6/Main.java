package lista4.questao6;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       double[] notas = new double[4];
       boolean notasInformadas = false;
       int opcao;


       do {
           System.out.println("Escolha uma opção:");
           System.out.println("1. Informar as notas do estudante");
           System.out.println("2. Calcular a média do estudante");
           System.out.println("3. Consultar status do estudante");
           System.out.println("0. Sair");
           opcao = scanner.nextInt();


           switch (opcao) {
               case 1:
                   System.out.println("Informe as quatro notas:");
                   for (int i = 0; i < 4; i++) {
                       System.out.printf("Nota %d: ", i + 1);
                       notas[i] = scanner.nextDouble();
                   }
                   notasInformadas = true;
                   break;


               case 2:
                   if (notasInformadas) {
                       double media = calcularMedia(notas);
                       System.out.printf("A média do estudante é: %.2f%n", media);
                   } else {
                       System.out.println("Você deve informar as notas primeiro.");
                   }
                   break;


               case 3:
                   if (notasInformadas) {
                       String status = consultarStatus(notas);
                       System.out.println("Status do estudante: " + status);
                   } else {
                       System.out.println("Você deve informar as notas primeiro.");
                   }
                   break;


               case 0:
                   System.out.println("Saindo do programa...");
                   break;


               default:
                   System.out.println("Opção inválida! Tente novamente.");
           }


           System.out.println();
       } while (opcao != 0);


       scanner.close();
   }


   private static double calcularMedia(double[] notas) {
       double soma = 0;
       for (double nota : notas) {
           soma += nota;
       }
       return soma / notas.length;
   }


   private static String consultarStatus(double[] notas) {
       double media = calcularMedia(notas);
       if (media >= 6) {
           return "Aprovado";
       } else if (media >= 4) {
           return "Em recuperação";
       } else {
           return "Reprovado";
       }
   }
}
