package Ejercicio_2.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        List<Integer> firstList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            firstList.add(i);
        }

        System.out.println("Primera lista: " + firstList);

        List<Integer> secondList = new ArrayList<>();

        ListIterator<Integer> iterator = firstList.listIterator(firstList.size());
        while (iterator.hasPrevious()) {
            secondList.add(iterator.previous());
        }

        System.out.println("Segunda lista: " + secondList);
    }
}
