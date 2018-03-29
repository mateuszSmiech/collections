package pl.dominisz.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * http://dominisz.pl
 * 25.03.2018
 */
public class App {

    private static Random random = new Random();

    public static void addElementsToFront(List<Integer> list, int count) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            list.add(0, random.nextInt());
        }
        long endTime = System.currentTimeMillis();
        System.out.println("addElementsToFront: " + (endTime - startTime) + " milliseconds");
    }

    public static void addElementsToBack(List<Integer> list, int count) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            list.add(random.nextInt());
        }
        long endTime = System.currentTimeMillis();
        System.out.println("addElementsToBack: " + (endTime - startTime) + " milliseconds");
    }

    public static void main(String[] args) {
        int count = 100000;
        //dla ArrayList
        //utworzyć nową listę
        List<Integer> arrayList = new ArrayList<>();
        System.out.println("array list");
        addElementsToFront(arrayList, count);
        addElementsToBack(arrayList, count);
        //przejrzeć całą listę
        //usunąć wszystkie elementy z listy poprzez usuwanie pierwszego elementu listy

        //dla LinkedList
        List<Integer> linkedList = new LinkedList<>();
        System.out.println("linked list");
        addElementsToFront(linkedList, count);
        addElementsToBack(linkedList, count);
        //przejrzeć całą listę
        //usunąć wszystkie elementy z listy poprzez usuwanie pierwszego elementu listy

        //zmierzyć czas każdej z operacji
    }

}
