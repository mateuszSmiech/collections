package pl.dominisz.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

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
        measureTimeForOperation(list, count, (list1, count1)->{
            for (int i = 0; i < count1; i++) {
                list1.add(random.nextInt());
            }
        }, "Add element to back");
    }

    public static void measureTimeForOperation(List<Integer> list,
                                               Consumer<List<Integer>> operation,
                                               String description) {
        long startTime = System.currentTimeMillis();
        operation.accept(list);
        long endTime = System.currentTimeMillis();
        System.out.println(description + (endTime - startTime) + " milliseconds");
    }
    public static void measureTimeForOperation(List<Integer> list,
                                               int count,
                                               BiConsumer<List<Integer>, Integer> operation,
                                               String description                                               ) {
        long startTime = System.currentTimeMillis();
        operation.accept(list, count);
        long endTime = System.currentTimeMillis();
        System.out.println(description + (endTime - startTime) + " milliseconds");
    }

    //użyć pętli for (int i
    public static void iterateList(List<Integer> list) {
        measureTimeForOperation(list, new Consumer<List<Integer>>() {
            @Override
            public void accept(List<Integer> list) {
                for (int i = 0; i < list.size(); i++) {
                    Integer element = list.get(i);
                }
            }
        }, "iterate list ");
    }

    //użyć pętli for each
    public static void iterateListForEach(List<Integer> list) {
        measureTimeForOperation(list,
                new ForEachListIterator(),
                "iterate list for each");
    }

    public static void deleteElementsFromFront(List<Integer> list) {
        measureTimeForOperation(list,
                list1 -> {
                    while (!list1.isEmpty()) {
                        list1.remove(0);
                    }
                }, "delete elements from front");
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
