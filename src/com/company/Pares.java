package com.company;
import java.util.Scanner;

public class Pares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert number ");
        int number = scanner.nextInt();
        scanner.close();

        for (int i = 0; i <= number; i++) {
            if (esPAr(i)) {
                System.out.println(i);
            }
        }
    }
    
    public  static  boolean esPAr(int n)
    {
        return n%2==0;
    }
}
