# Kolekcje

### W jaki sposób wygląda hierarchia interfejsów związana z kolekcjami?

Na szczycie hierarchi klas znajduje się interface Collection. Pochodnymi interfejsu Collection są:
* List
* Set 
    * pochodną jest SortedSet
* Queue
* Deque

Obok tej hierarchii znajduje się Map oraz pochodny SortedMap.

### Jakie są podstawowe implementacje poszczególnych interfejsów?

Podstawowymi implementacjami interfejsów są:
* List: LinkedList, ArrayList, 
* Set: HashSet, TreeSet, LinkedHashSet
* Queue: LinkedList, PriorityQueue
* Deque: LinkedList
* Map: HashMap, TreeMap, LinkedHashMap

### W których kolekcjach elementy są sortowane i w jaki sposób?

Kolekcje, których elementy możemy posortować:
* ArrayList, LinkedList - możemy wykorzystać metodę sort i podać opcjonalnie komparator

Kolekcje, które przechowują elementy w sposób posortowany:
* TreeSet - może wykorzystywać naturalny porządek elementów lub możemy podać własny komparator
* LinkedHashSet - przechowuje elementy w kolejności wstawienia
* PriorityQueue - naturalny porządek lub komparator
* TreeMap - posortowane po kluczu
* LinkedHashMap - przechowuje elementy w kolejności wstawienia kluczy

### Implementacje interfejsu List – złożoność operacji

* Napisać aplikację wykorzystującą różne implementacje List i sprawdzić różnice w operacjach dodawania na początek listy, usuwania z początku listy, przeglądania całej listy

### Do których kolekcji można wstawiać wartości null?

Miejsce na odpowiedź

### Napisać operacje wykorzystującą różne implementacje Set i sprawdzić różnice w operacjach dodawania do zbioru

Miejsce na odpowiedź
