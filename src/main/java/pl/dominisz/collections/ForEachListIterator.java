package pl.dominisz.collections;

import java.util.List;
import java.util.function.Consumer;

/**
 * http://dominisz.pl
 * 29.03.2018
 */
public class ForEachListIterator implements Consumer<List<Integer>> {

    @Override
    public void accept(List<Integer> list) {
        for (Integer integer : list) {
            Integer element = integer;
        }
    }

}
