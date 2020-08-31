package Beginner;

import java.util.Scanner;

public class P1038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cod, qtd;
        double dog, xs, xb, tor, soda;

        cod = scanner.nextInt();
        qtd = scanner.nextInt();

        if(cod == 1) {
            dog = 4.00 * qtd;
            System.out.printf("Total: R$ %.2f\n", dog);
        }
        else if(cod == 2) {
            xs = 4.50 * qtd;
            System.out.printf("Total: R$ %.2f\n", xs);
        }
        else if(cod == 3) {
            xb = 5.00 * qtd;
            System.out.printf("Total: R$ %.2f\n", xb);
        }
        else if(cod == 4) {
            tor = 2.00 * qtd;
            System.out.printf("Total: R$ %.2f\n", tor);
        }
        else if(cod == 5) {
            soda = 1.50 * qtd;
            System.out.printf("Total: R$ %.2f\n", soda);
        }
    }
}
