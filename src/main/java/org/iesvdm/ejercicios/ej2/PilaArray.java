package org.iesvdm.ejercicios.ej2;

import java.util.LinkedList;
import java.util.List;

public class PilaArray<T> {

    private List<T> pilaGenerica = new LinkedList<>();

    public void estaVacia() {
        boolean estaVacia = false;
        if (pilaGenerica.isEmpty()) {
            estaVacia = true;
            System.out.println("\nPila vacia -> " + true);
        } else {
            System.out.println("\nPila no vacia -> " + false);
        }
        System.out.println("Pila: " + pilaGenerica);
    }

    public void extraer() {
        System.out.println("\nElemento a extraer: " + pilaGenerica.getFirst());
        pilaGenerica.removeFirst();
        System.out.println("Pila: " + pilaGenerica);
    }

    public void primero() {
        System.out.println("\nPrimer Elemento: " + pilaGenerica.getFirst());
    }

    public void aniadir(T valor) {

        List<T> aux = new LinkedList<>();
        aux.add(valor);
        for (int i = 0; i < pilaGenerica.size(); i++) {
            aux.add(pilaGenerica.get(i));
        }
        pilaGenerica.clear();
        pilaGenerica.addAll(aux);

        System.out.println("\nAñadiendo elemento ...");
        System.out.println("Pila: " + pilaGenerica);
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < pilaGenerica.size(); i++) {
            result += String.valueOf(pilaGenerica.get(i));
            if (i!= pilaGenerica.size() - 1) {
                result += ", ";
            }
        }
        System.out.println("\nImprimiendo resultado como cadena ... ");
        return "Pila: " + result;
    }

}
