package org.agileindia.mathworks;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    public static List<Integer> selectPrime(List<Integer> numbers) {
        List<Integer> primeNumbers = new ArrayList<Integer>();
        for (Integer number : numbers) {
            if (isPrime(number)) {
                primeNumbers.add(number);
            }
        }
        return primeNumbers;
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (long i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> selectOdd(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();

        for(int number: numbers){
            if(isOdd(number)){
                oddNumbers.add(number);
            }
        }
        return oddNumbers;
    }

    private static boolean isOdd(int number) {
        if(number % 2 != 0){
            return true;
        }
        return false;
    }
}