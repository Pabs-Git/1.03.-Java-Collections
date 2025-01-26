package Ejercicio_2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        // 1. Crear y rellenar la primera lista
        List<Integer> firstList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {  // Rellenar con números del 1 al 10
            firstList.add(i);
        }

        // Imprimir la primera lista
        System.out.println("Primera lista: " + firstList);

        // 2. Crear la segunda lista vacía
        List<Integer> secondList = new ArrayList<>();

        // 3. Usar ListIterator para recorrer la primera lista al revés
        ListIterator<Integer> iterator = firstList.listIterator(firstList.size()); // Empezar al final
        while (iterator.hasPrevious()) { // Comprobar si hay un elemento anterior
            secondList.add(iterator.previous()); // Obtener el elemento anterior e insertarlo en la segunda lista
        }

        // Imprimir la segunda lista
        System.out.println("Segunda lista: " + secondList);
    }
}
