package questaoFibonacci;

public class Fibonacci {

    /* Optei por não usar recursividade por que o
        método iterativo tende a ser mais eficiente
        em termos de uso de memória e tempo para números grandes */

    public boolean isFibonacci(int number) {
        int a = 0, b = 1;

        if (number == 0 || number == 1) {
            return true;
        }

        while (b < number) {
            int next = a + b;
            a = b;
            b = next;
        }

        return b == number;
    }
}
