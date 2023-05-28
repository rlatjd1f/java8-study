package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        final StringBuilder stringBuilder = new StringBuilder();
        final int size = numbers.size();

        for (int i = 0; i < size; i++) {
            stringBuilder.append(numbers.get(i));
            if (i != size - 1){
                stringBuilder.append(" : ");
            }
        }
        System.out.println("stringBuilder = " + stringBuilder);

        final String result = numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" : "));
        System.out.println("result = " + result);
    }
}