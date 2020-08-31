package Beginner;

import java.util.Scanner;

public class P1020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, year, day, m, month;

        number = scanner.nextInt();

        year = number / 365;
        m = number % 365;
        month = m / 30;
        day = m % 30;

        System.out.println(year + " ano(s)");
        System.out.println(month + " mes(es)");
        System.out.println(day + " dia(s)");

    }
}
