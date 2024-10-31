package lista4;

import java.util.Scanner;

class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Digite o salário bruto do funcionário: ");
       double salary = scanner.nextDouble();
       double tax;


       if (salary <= 2000.00) {
           tax = 0.0;
       } else if (salary <= 3500.00) {
           tax = salary * 0.15;
       } else if (salary <= 5000.00) {
           tax = salary * 0.22;
       } else {
           tax = salary * 0.30;
       }


       System.out.printf("O salário é: R$ %.2f%n", salary);
       System.out.printf("O imposto a ser pago é: R$ %.2f%n", tax);
   }
}
