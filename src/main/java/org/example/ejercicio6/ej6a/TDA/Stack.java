package org.example.ejercicio6.ej6a.TDA;

public interface Stack {

    /**
     * Precondición: La pila no puede estar vacía
     * @return Obtener el elemento de la parte superior
     */
    int getTop();

    /**
     * Precondición: La pila no puede estar vacía
     */
    void remove();
    void add(int value);
    boolean isEmpty();

}
