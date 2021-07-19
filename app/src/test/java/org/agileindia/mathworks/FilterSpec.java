package org.agileindia.mathworks;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

public class FilterSpec {
    @Test
    public void itSelectsPrimeNumbers() {
        //Given
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        //When
        List<Integer> primeNumbers = Filter.select(Condition.prime, numbers);

        //Then
        assertThat(primeNumbers, hasSize(2));
        assertThat(primeNumbers, hasItems(2, 3));
        assertThat(primeNumbers, not(hasItems(1, 4)));
    }

    @Test
    public void itDoesNotSelectNegativePrimeNumbers() {
        //Given
        List<Integer> numbers = Arrays.asList(-1, 2, -3, 4);

        //When
        List<Integer> primeNumbers = Filter.select(Condition.prime, numbers);

        //Then
        assertThat(primeNumbers, hasSize(1));
        assertThat(primeNumbers, hasItem(2));
        assertThat(primeNumbers, not(hasItems(-1, -3, 4)));
    }

    @Test
    public void itSelectsOddNumbers() {
        //Given
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, -1);

        //When
        List<Integer> oddNumbers = Filter.select(Condition.odd, numbers);

        //Then
        assertThat(oddNumbers, hasSize(3));
        assertThat(oddNumbers, hasItems(1, 3, -1));
    }
}