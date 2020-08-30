package com.URI;

import java.util.Scanner;

public class P1004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, prod;

        a = scan.nextInt();
        b = scan.nextInt();
        prod = a * b;

        System.out.printf("PROD = %d\n", prod);
    }
}
