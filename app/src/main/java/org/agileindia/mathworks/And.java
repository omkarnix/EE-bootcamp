package org.agileindia.mathworks;

public class And implements Condition {
    private Condition[] conditions;

    public And(Condition[] conditions) {
        this.conditions = conditions;
    }

    @Override
    public boolean isSatisfiedBy(int number) {
        for (Condition condition : conditions) {
            if (!condition.isSatisfiedBy(number)) {
                return false;
            }
        }
        return true;
    }
}
