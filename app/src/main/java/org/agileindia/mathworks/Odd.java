package org.agileindia.mathworks;

public class Odd implements Condition {
    @Override
     public boolean isSatisfiedBy(int number) {
        return number % 2 != 0;
    }
}