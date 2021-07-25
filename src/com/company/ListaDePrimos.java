package com.company;

import java.util.Scanner;

public class ListaDePrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert n ");
        int n = scanner.nextInt();

        scanner.close();

        for (int c = 0; c <= n ; c++) {
            if (Primos.esPrimo(c)) {
                System.out.println(c);
            }
        }
    }
}