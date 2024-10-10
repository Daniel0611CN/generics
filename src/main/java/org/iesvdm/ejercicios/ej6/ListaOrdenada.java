package org.iesvdm.ejercicios.ej6;

import java.util.LinkedList;
import java.util.List;

public class ListaOrdenada<E extends Comparable<E>> implements Comparable<ListaOrdenada<E>> {

    private List<E> pila = new LinkedList<>();

    public ListaOrdenada(List<E> pila) {
        this.pila = pila;
    }

    public List<E> getPila() {
        return pila;
    }

    public void setPila(List<E> pila) {
        this.pila = pila;
    }

    @Override
    public int compareTo(ListaOrdenada<E> o) {
        return 0;
    }

    public void add(E o) {

    }

    public E get(int index) {
        return null;
    }

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean remove(E o) {
        return false;
    }

    public int indexOf(E o) {
        return 0;
    }

    @Override
    public String toString() {
        return "ListaOrdenada{" +
                "pila=" + pila +
                '}';
    }
}
