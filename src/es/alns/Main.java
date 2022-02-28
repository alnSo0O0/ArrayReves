package es.alns;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int [] array1 = new int[5];
        Scanner entrada = new Scanner(System.in);
        System.out.println("dame numerico para la array: ");
        for(int i = 0; i < array1.length; i++ ){
            System.out.print("Número "+ (i + 1) + " : ");
            array1[i] = entrada.nextInt();
        }
        System.out.println();
        System.out.println("Array1: ");
        for (int i = 0; i<array1.length; i++){
            System.out.print(array1[i] + " ");
        }

        int [] array2 = new int[5];
        for(int i = 0; i < array2.length; i++ ){
            array2[array2.length - i - 1] = array1[i];
        }
        System.out.println();
        System.out.println();
        System.out.println("Array2: ");
            for (int i = 0; i<array2.length; i++){
                System.out.print(array2[i]+" ");
        }

    }
}
