package org.agileindia.mathworks;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    public static List<Integer> select(List<Integer> numbers, Condition... conditions) {
        List<Integer> selected = new ArrayList<>();
        for (int number : numbers) {
            boolean allConditionsSatisfied = true;
            for (Condition condition : conditions) {
                if (!condition.isSatisfiedBy(number)) {
                    allConditionsSatisfied = false;
                    break;
                }
            }
            if (allConditionsSatisfied) {
                selected.add(number);
            }
        }
        return selected;
    }

}