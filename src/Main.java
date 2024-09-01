import questaoFibonacci.Fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Questão 1
        Scanner scanner = new Scanner(System.in);
        Fibonacci checker = new Fibonacci();

        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int number = scanner.nextInt();

        if (checker.isFibonacci(number)) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + number + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();


        // Questão 2


    }
}