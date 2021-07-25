package com.company;

import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert n ");
        int n = scanner.nextInt();

        scanner.close();

        if (esPrimo(n)) {
            System.out.println(n + " es primo");
        }
        else {
            System.out.println(n + " no es primo");
        }
    }

    public static boolean esPrimo(int n){
        int i = 2;
        boolean esPrimo = true;
        while ((esPrimo) && (i!=n)){
            if (n % i == 0)
                esPrimo = false;
            i++;
        }
        return esPrimo;
    }
}