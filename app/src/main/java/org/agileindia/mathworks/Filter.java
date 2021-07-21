package org.agileindia.mathworks;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    public static List<Integer> select(List<Integer> numbers, Condition... conditions) {
        List<Integer> selected = new ArrayList<>();
        for (int number : numbers) {
            if (areAllConditionsSatisfied(number, conditions)) {
                selected.add(number);
            }
        }
        return selected;
    }

    private static boolean areAllConditionsSatisfied(int number, Condition... conditions) {
        for (Condition condition : conditions) {
            if (!condition.isSatisfiedBy(number)) {
                return false;
            }
        }
        return true;
    }

}