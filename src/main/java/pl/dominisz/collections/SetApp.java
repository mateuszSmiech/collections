package pl.dominisz.collections;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class SetApp {

    public static void main(String[] args) {
        //Zbiory przechowujące Stringi
        // Utworzyć HashSet,
        //Utworzyć TreeSet,
        //Utworzyć LinkedHashSet
        
        //dodać elementy HashSet
        //dodać elementy TreeSet
        //dodać elementy LinkedHashSet
        //wyswietlić elementy zbiorów, foreach
        HashSet<String> hashSet = new HashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        TreeSet<String> treeSetComparator = new TreeSet<>(new TreeSetComparator());

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        addToSet(hashSet);
        addToSet(treeSet);
        addToSet(linkedHashSet);
        System.out.println("hashSet");
        showSet(hashSet);
        System.out.println("treeSet");
        showSet(treeSet);
        System.out.println("treeSetComparator");
        showSet(treeSetComparator);
        System.out.println("linkedHashSet");
        showSet(linkedHashSet);

        
        
    }
    
    public static void addToSet(Set<String> text) {
        text.add("qwe");
        text.add("asdswww");
        text.add("zxcsss");
        text.add("wers");
        text.add("sd");
    }
    
    public static void showSet(Set<String> text) {
        for(String texts: text) {
            System.out.println(texts);
        }
    }
    
    public String getWord(String text) {
        String[] splittedText = text.split(" ");
        Random rand = new Random();
        int number = rand.nextInt(splittedText.length-1);
        return splittedText[number];
    }
}
