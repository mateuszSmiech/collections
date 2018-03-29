package pl.dominisz.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class App {
    private static Random rand = new Random();

    public static void main(String[] args) {
        //dla ArrayList
        //Utworzyć nową listę dodawająć n losowych elementów listy,
        //Utworzyć nową listę poprzez dodawanie na początku listy,
        //Przejrzeć całą listę
        //usunąć wszystkie elementy listy poprzez usuwanie pierwszego
        int count = 100000;

        List<Integer> list = new ArrayList<>();
        System.out.println("Creating: ");
        addElementsToFront(list, count);
        addElementsToBack(list, count);

        System.out.println("Iteration: ");
        iterateForEachList(list);
        iterateForList(list);

        System.out.println("Remove: ");
        //removeForEachList(list);
        //addElementsToBack(list, count);
        removeForList(list);

        System.out.println("-------------");


        List<Integer> linkedList = new LinkedList<>();
        System.out.println("Creating: ");
        addElementsToFront(linkedList, count);
        addElementsToBack(linkedList, count);
        System.out.println("Iteration: ");
        iterateForEachList(linkedList);
        iterateForList(linkedList);
        System.out.println("Remove: ");
        //removeForEachList(linkedList);
        //addElementsToBack(linkedList, count);
        removeForList(linkedList);

        //dla LinkedList
        //Utworzyć nową listę dodawająć n losowych elementów listy,
        //Utworzyć nową listę poprzez dodawanie na początku listy,
        //Przejrzeć całą listę
        //usunąć wszystkie elementy listy poprzez usuwanie pierwszego

        //zmierzyć czas każdej z operacji

    }

    public static void addElementsToFront(List<Integer> list, int count) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; count > i; i++) {
            list.add(0, rand.nextInt(90));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("addElementsToFront: "+ (endTime - startTime)+ "ms.");
    }

    public static void addElementsToBack(List<Integer> list, int count) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; count > i; i++) {
            list.add(rand.nextInt(90));
        }

        long endTime = System.currentTimeMillis();
        System.out.println("addElementsToBack: "+ (endTime - startTime)+ "ms.");
    }

    public static void iterateForEachList(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for(Integer lists: list) {
            list.get(lists);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("iterateForEachList: "+ (endTime - startTime)+ "ms.");
    }
    public static void iterateForList(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for(int i = 0;list.size()-1>i;i++ ) {
            list.get(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("iterateForList: "+ (endTime - startTime)+ "ms.");

    }

    public static void removeForEachList(List<Integer>list) {
        long startTime = System.currentTimeMillis();
        for(Integer lists: list) {
            list.remove(lists);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("removeList: "+ (endTime - startTime)+ "ms.");
    }

    public static void removeForList(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for(int i = 0;list.size()-1>i;i++ ) {
            list.remove(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("removeList: "+ (endTime - startTime)+ "ms.");
    }

}
