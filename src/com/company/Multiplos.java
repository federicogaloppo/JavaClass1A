package com.company;
import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert n ");
        int n = scanner.nextInt();

        System.out.print("Insert m ");
        int m = scanner.nextInt();

        scanner.close();

        for (int i = 0; i <= n; i++) {
            if (esMultiplo(i, m)) {
                System.out.println(i);
            }
        }
    }

    public static boolean esMultiplo(int i, int m) {
        return i % m == 0;
    }
}