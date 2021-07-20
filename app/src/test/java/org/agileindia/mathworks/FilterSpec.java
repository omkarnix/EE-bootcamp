package org.agileindia.mathworks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

public class FilterSpec {
    @Test
    public void itSelectsPrimeNumbers() {
        //Given
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, -1, -3);

        //When
        List<Integer> primeNumbers = Filter.select(Collections.singletonList(Condition.prime), numbers);

        //Then
        assertThat(primeNumbers, hasSize(2));
        assertThat(primeNumbers, containsInAnyOrder(2, 3));
    }

    @Test
    public void itSelectsOddNumbers() {
        //Given
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, -1);

        //When
        List<Integer> oddNumbers = Filter.select(Collections.singletonList(Condition.odd), numbers);

        //Then
        assertThat(oddNumbers, hasSize(3));
        assertThat(oddNumbers, containsInAnyOrder(1, 3, -1));
    }

    @Test
    public void itSelectsOddPrimes() {
        //Given
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, -1, -2, -3);

        //When
        List<Integer> oddPrimes = Filter.select(Arrays.asList(Condition.odd, Condition.prime), numbers);

        //Then
        assertThat(oddPrimes, containsInAnyOrder(3, 5, 7));
    }
}