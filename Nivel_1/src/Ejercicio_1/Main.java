package Ejercicio_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Month> months = new ArrayList<>();
        Collections.addAll(
                months,
                new Month("Enero"),
                new Month("Febrero"),
                new Month("Marzo"),
                new Month("Abril"),
                new Month("Mayo"),
                new Month("Junio"),
                new Month("Julio"),
                new Month("Septiembre"),
                new Month("Octubre"),
                new Month("Noviembre"),
                new Month("Diciembre")
        );

        System.out.println(months);

        //Demostrar que tiene un orden correcto imprimiendo el indice "10", que sera diciembre debido a que agosto no existe en el array y debido a que "0" es enero.
        System.out.println(months.get(10));

        Set<Month> monthsSet = new HashSet<>(months);

        //Recorrer el HashSet con un bucle for-each
        System.out.println("Recorriendo con un for-each:");
        for (Month month : monthsSet) {
            System.out.println(month.getName());
        }

        //Recorrer el HashSet con un iterador
        System.out.println("\nRecorriendo con un iterador:");
        Iterator<Month> iterator = monthsSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }
}