import questaoFibonacci.Fibonacci;
import questaoVerificarString.LetterCount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
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
        */


        /*
        // Questão 2
        Scanner scanner2 = new Scanner(System.in);
        LetterCount counter = new LetterCount();

        System.out.print("Digite uma string para verificar a presença da letra 'a': ");
        String input = scanner2.nextLine();

        boolean containsA = counter.containsA(input);
        int count = counter.countOccurrencesOfA(input);

        if (containsA) {
            System.out.println("A letra 'a' (ou 'A') está presente na string.");
        } else {
            System.out.println("A letra 'a' (ou 'A') não está presente na string.");
        }

        System.out.println("Quantidade de vezes que a letra 'a' (ou 'A') ocorre: " + count);

        scanner2.close();
        */



        /*

        // Questão 3
        // Optei por criar na main tendo em vista que na minha visão,
        // a questão não precisaria criar o código e sim apenas informar o valor

        int INDICE = 12;
        int SOMA = 0;
        int K = 1;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println(SOMA);

        // O valor da soma é 77.

         */


        /*  Questão 4

        Descubra a lógica e complete o próximo elemento:

        a) 1, 3, 5, 7, [9]

        b) 2, 4, 8, 16, 32, 64, [128]

        c) 0, 1, 4, 9, 16, 25, 36, [49]

        d) 4, 16, 36, 64, [100]

        e) 1, 1, 2, 3, 5, 8, [13]

        f) 2, 10, 12, 16, 17, 18, 19, [20]

         */


        /*Questão 5


        Primeiro, ligo o primeiro interruptor e o deixo ligado por um tempo.
        Depois, desligo o primeiro interruptor e ligo o segundo, deixando o terceiro desligado.
        Em seguida, volto e verifico:

        A lâmpada que está acesa é controlada pelo segundo interruptor.
        A lâmpada que está desligada, mas quente, é controlada pelo primeiro interruptor.
        A lâmpada que está desligada e fria é controlada pelo terceiro interruptor

         */
    }
}