package Beginner;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class P1001 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer a, b, x;

        a = scanner.nextInt();
        b = scanner.nextInt();

        x = a + b;

        System.out.printf("X = %d\n", x);
    }
}
