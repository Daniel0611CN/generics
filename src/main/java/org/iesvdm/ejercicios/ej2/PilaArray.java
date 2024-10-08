package org.iesvdm.ejercicios.ej2;

import java.util.LinkedList;
import java.util.List;

public class PilaArray<T> {

    private final List<T> pilaGenerica = new LinkedList<>();

    public void estaVacia() {
        if (pilaGenerica.isEmpty()) {
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
        aux.addAll(pilaGenerica);
        pilaGenerica.clear();
        pilaGenerica.addAll(aux);

        System.out.println("\nAñadiendo elemento ...");
        System.out.println("Pila: " + pilaGenerica);
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < pilaGenerica.size(); i++) {
            result.append(pilaGenerica.get(i));
            if (i != pilaGenerica.size() - 1) {
                result.append(", ");
            }
        }
        System.out.println("\nImprimiendo resultado como cadena ... ");
        return "Pila: " + result;
    }

}
