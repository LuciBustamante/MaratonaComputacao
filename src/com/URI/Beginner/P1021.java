package Beginner;

import java.util.Scanner;

public class P1021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float value;
        double v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12;
        double r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12;

        value = scanner.nextFloat();

        v1 = (Math.floor(value / 100.00));
        r1 = value % 100.00;
        v2 = (Math.floor(r1 / 50.00));
        r2 = r1 % 50.00;
        v3 = (Math.floor(r2 / 20.00));
        r3 = r2 % 20;
        v4 = (Math.floor(r3 / 10));
        r4 = r3 % 10;
        v5 = (Math.floor(r4 / 5));
        r5 = r4 % 5;
        v6 = (Math.floor(r5 / 2));
        r6 = r5 % 2;
        v7 = (Math.floor(r6 / 1));
        r7 = r6 % 1;
        v8 = (Math.floor(r7 / 0.5));
        r8 = r7 % 0.5;
        v9 = (Math.floor(r8 / 0.25));
        r9 = r8 % 0.25;
        v10 = (Math.floor(r9 / 0.10));
        r10 = r9 % 0.10;
        v11 = (Math.floor(r10 / 0.05));
        r11 = r10 % 0.05;
        v12 = r11 / 0.01;

        System.out.println("NOTAS:");
        System.out.printf("%.0f nota(s) de R$ 100.00\n", v1);
        System.out.printf("%.0f nota(s) de R$ 50.00\n", v2);
        System.out.printf("%.0f nota(s) de R$ 20.00\n", v3);
        System.out.printf("%.0f nota(s) de R$ 10.00\n", v4);
        System.out.printf("%.0f nota(s) de R$ 5.00\n", v5);
        System.out.printf("%.0f nota(s) de R$ 2.00\n", v6);
        System.out.println("MOEDAS:");
        System.out.printf("%.0f moeda(s) de R$ 1.00\n", v7);
        System.out.printf("%.0f moeda(s) de R$ 0.50\n", v8);
        System.out.printf("%.0f moeda(s) de R$ 0.25\n", v9);
        System.out.printf("%.0f moeda(s) de R$ 0.10\n", v10);
        System.out.printf("%.0f moeda(s) de R$ 0.05\n", v11);
        System.out.printf("%.0f moeda(s) de R$ 0.01\n", v12);
    }
}
