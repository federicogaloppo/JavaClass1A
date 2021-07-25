package com.company;
import java.util.Scanner;

public class Naturales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert n ");
        int n = scanner.nextInt();

        System.out.print("Insert m ");
        int m = scanner.nextInt();

        System.out.print("Insert d ");
        int d = scanner.nextInt();

        scanner.close();

        int numerosEncontrados = 0;
        int i = 0;
        while (numerosEncontrados < n)
        {
            if (cantidadDijitosEnComun(i, d) >= m)
            {
                System.out.println(i);
                numerosEncontrados++;
            }
            i++;
        }
    }

    public static int cantidadDijitosEnComun(int number, int d){
        int dijitosEnComun = 0;

        String sNumber = String.valueOf(number);
        char[] arrayDigits = sNumber.toCharArray();
        for(char n: arrayDigits){
            int t = + Character.getNumericValue(n);
            if(Character.getNumericValue(n) == d){
                dijitosEnComun++;
            }
        }
        return dijitosEnComun;
    }
}