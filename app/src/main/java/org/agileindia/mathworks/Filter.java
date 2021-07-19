package org.agileindia.mathworks;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    public static List<Integer> select(Condition condition, List<Integer> numbers) {
        List<Integer> selected = new ArrayList<>();
        for (int number : numbers) {
            if (condition.isSatisfiedBy(number)) {
                selected.add(number);
            }
        }
        return selected;
    }

}