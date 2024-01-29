package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class algoritmoFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println(" ");
        System.out.println("===============================================================");
        System.out.println("Imprime la serie de Fibonacci del número de veces que indiques");
        System.out.println("===============================================================");
        System.out.println(" ");

        /*Pedir al usuario que indique el número de veces que hará la suma.*/
        do {
            System.out.println("Por favor, introduce un número mayor que 1: ");
            num = sc.nextInt();
        } while (num <= 1);

        /*Imprime por pantalla la serie de Fibonacci*/
        System.out.println(" ");
        System.out.println("Los primeros " + num + " números de la serie son: ");

        for (int i = 0; i < num; i++) {
            System.out.println(numero(i) + " ");
        }
    }
    public static int numero (int num){
        if (num <= 1){
            return num;
        } else {
            return numero(num-1) + numero(num - 2);
        }
    }
}