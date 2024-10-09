package org.iesvdm.ejercicios.ej4;

public class Main {

    public static void main(String[] args) {

        Integer[][] matriz = new Integer[4][2];

        int value = 1;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = value;
                value++;
            }
        }

        System.out.println();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nElemento Fila 1 Columna 2: " + matriz[0][1]);

    }

}
