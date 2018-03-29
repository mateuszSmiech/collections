# Kolekcje

### W jaki sposób wygląda hierarchia interfejsów związana z kolekcjami?

Na szczycie hierarchi jest interface **Collection**.
Pochodnymi Collections są: 
* List, 
* Set, 
    *  Pochodna SortedSet
* Queue, 
* Deque.
Obok tej hierarchi znajduje się Map oraz pochodne SortedMap

### Jakie są podstawowe implementacje poszczególnych interfejsów?

Podstawowymi implementacjami interfaceów są :
* List: ArrayList, LinkedList.
* Set: HashSet, TreeSet, LinkedHashSet,
* Queue: PriorityQueue, LinkedList
* Map: HashMap, TreeMap, LinkedHashMap
* Deque: BlockingDeque, Linked List, ArrayDeque,

### W których kolekcjach elementy są sortowane i w jaki sposób?

Elementy mogą być sortowane:
* List- metodą sort, 
* LinkedList,
* ArrayList

Kolekcje które przchowują elementy w sposób posortowany
* TreeSet- może wykożystywać naturalny porządek lub poprzez Comparator.
* TreeMap- posortowany po kluczu
* PriorityQueue- naturalny porządek lub comprarator.
* LinkedHashSet- przechowuje elementy w kolejności wstawienia.

### Implementacje interfejsu List – złożoność operacji

Miejsce na odpowiedź

### Do których kolekcji można wstawiać wartości null?

Miejsce na odpowiedź

### Napisać aplikację wykorzystującą różne implementacje List i sprawdzić różnice w operacjach dodawania na początek listy, usuwania z początku listy, przeglądania całej listy

Miejsce na odpowiedź

### Napisać operacje wykorzystującą różne implementacje Set i sprawdzić różnice w operacjach dodawania do zbioru

Miejsce na odpowiedź
