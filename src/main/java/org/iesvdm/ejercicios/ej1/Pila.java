package org.iesvdm.ejercicios.ej1;

import java.util.LinkedList;
import java.util.List;

public class Pila {

    private List<Integer> pila = new LinkedList<>();

    public void estaVacia() {
        boolean estaVacia = false;
        if (pila.isEmpty()) {
            estaVacia = true;
            System.out.println("\nPila vacia -> " + true);
        } else {
            System.out.println("\nPila no vacia -> " + false);
        }
        System.out.println("Pila: " + pila);
    }

    public void extraer() {
        System.out.println("\nElemento a extraer: " + pila.getFirst());
        pila.removeFirst();
        System.out.println("Pila: " + pila);
    }

    public void primero() {System.out.println("\nPrimer Elemento: " + pila.getFirst());}

    public void aniadir(int valor) {

        List<Integer> aux = new LinkedList<>();
        aux.add(valor);
        for (int i = 0; i < pila.size(); i++) {
            aux.add(pila.get(i));
        }
        pila.clear();
        pila.addAll(aux);

        System.out.println("\nAñadiendo elemento ...");
        System.out.println("Pila: " + pila);
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < pila.size(); i++) {
            result += String.valueOf(pila.get(i));
            if (i!= pila.size() - 1) {
                result += ", ";
            }
        }
        System.out.println("\nImprimiendo resultado como cadena ... ");
        return "Pila: " + result;
    }

}
