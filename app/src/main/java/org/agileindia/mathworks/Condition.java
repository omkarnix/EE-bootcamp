package org.agileindia.mathworks;

public interface Condition {
    Condition prime = new Prime();
    Condition odd = new Odd();

    boolean isSatisfiedBy(int number);
}
