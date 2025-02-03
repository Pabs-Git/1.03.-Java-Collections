package Ejercicio_1.Main;

import Ejercicio_1.Classes.Month;

import java.util.ArrayList;
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

        months.add(7,new Month("Agosto"));

        System.out.println("Mostrar que los meses mantienen orden correcto despues de añadir 'Agosto'");
        System.out.println(months);

        Set<Month> monthsSet = new HashSet<>(months);

        monthsSet.add(new Month("Agosto"));

        System.out.println("Mostrar meses con for-each");
        for (Month month : monthsSet) {
            System.out.println(month.getName());
        }

        System.out.println("Mostrar meses con iterador");
        Iterator<Month> iterator = monthsSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }
}