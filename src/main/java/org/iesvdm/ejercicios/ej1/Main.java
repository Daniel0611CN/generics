package org.iesvdm.ejercicios.ej1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pila p = new Pila();

        message();
        int opcion = sc.nextInt();

        while (opcion != 5) {
            switch (opcion) {
                case 1:
                    System.out.println("\nIntroduce el valor que quieres añadir: ");
                    int value = sc.nextInt();
                    p.aniadir(value);
                    message();
                    opcion = sc.nextInt();
                    break;
                case 2:
                    p.primero();
                    message();
                    opcion = sc.nextInt();
                    break;
                case 3:
                    p.extraer();
                    message();
                    opcion = sc.nextInt();
                    break;
                case 4:
                    p.estaVacia();
                    message();
                    opcion = sc.nextInt();
                    break;
            }
        }

        System.out.println(p);
        sc.close();
    }

    static void message() {
        System.out.println("\nIntroduce una opción:\n1. Añadir valor\n2. Primer valor\n3. Extraer Valor\n4. Comprobar si está vacía.\n5. Imprimir");
    }

}
