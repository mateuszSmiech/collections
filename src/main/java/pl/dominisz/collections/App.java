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

    //użyć pętli for (int i
    public static void iterateList(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            Integer element = list.get(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("iterateList: " + (endTime - startTime) + " milliseconds");
    }

    //użyć pętli for each
    public static void iterateListForEach(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (Integer integer : list) {
            Integer element = integer;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("iterateListForEach: " + (endTime - startTime) + " milliseconds");
    }

    public static void deleteElementsFromFront(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        while (!list.isEmpty()) {
            list.remove(0);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("deleteElementsFromFront: " + (endTime - startTime) + " milliseconds");
    }

    public static void main(String[] args) {
        int count = 100000;
        //dla ArrayList
        List<Integer> arrayList = new ArrayList<>();
        System.out.println("array list");
        addElementsToFront(arrayList, count);
        addElementsToBack(arrayList, count);
        iterateList(arrayList);
        iterateListForEach(arrayList);
        deleteElementsFromFront(arrayList);

        //dla LinkedList
        List<Integer> linkedList = new LinkedList<>();
        System.out.println("linked list");
        addElementsToFront(linkedList, count);
        addElementsToBack(linkedList, count);
        iterateList(linkedList);
        iterateListForEach(linkedList);
        deleteElementsFromFront(linkedList);
    }

}
