package lista4.questao2;

import java.util.Scanner;

class Main {
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.print("Digite o primeiro número: ");
       double number1 = scanner.nextDouble();


       System.out.print("Digite o segundo número: ");
       double number2 = scanner.nextDouble();


       System.out.println("___________________________");
       System.out.println("1 - Realizar a soma entre os dois números");
       System.out.println("2 - Realizar a subtração entre os dois números");
       System.out.println("3 - Realizar a multiplicação entre os dois números");
       System.out.println("4 - Realizar a divisão entre os dois números");
       System.out.print("Qual opção deseja? ");
       int operation = scanner.nextInt();
       double result;


       switch (operation) {
           case 1:
               result = sum(number1, number2);
               System.out.println("O resultado é : " + result);
               break;
           case 2:
               result = subtraction(number1, number2);
               System.out.println("O resultado é : " + result);
               break;
           case 3:
               result = multiplication(number1, number2);
               System.out.println("O resultado é : " + result);
               break;
           case 4:
               result = division(number1, number2);
               System.out.println("O resultado é : " + result);
               break;
           default:
               System.out.println("Opção inválida");
               break;
       }
       scanner.close();
   }


   public static double sum(double number1, double number2) {
       return number1 + number2;
   }
   public static double subtraction(double number1, double number2) {
       return number1 - number2;
   }
   public static double multiplication(double number1, double number2) {
       return number1 * number2;
   }
   public static double division(double number1, double number2) {
      return number1 / number2;
   }
}
