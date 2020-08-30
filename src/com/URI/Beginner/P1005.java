package Beginner;

import java.util.Scanner;

public class P1005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b;
        double average;

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        average = ((a * 3.5) + (b * 7.5)) / 11;

        System.out.printf("MEDIA = %.5f\n", average);
    }
}
