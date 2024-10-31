package lista4;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);


       char[] respostasCorretas = {'A', 'B', 'D', 'E', 'C'};
       double[] pesos = {1.0, 1.0, 3.0, 2.5, 2.5};
       double notaFinal = 0.0;


       for (int i = 0; i < respostasCorretas.length; i++) {
           System.out.printf("Digite a resposta da questão %d: ", (i + 1));
           char resposta = scanner.next().toUpperCase().charAt(0);


           if (resposta == respostasCorretas[i]) {
               notaFinal += pesos[i];
           }
       }


       System.out.printf("A nota final obtida é: %.1f%n", notaFinal);


       scanner.close();
   }
}
