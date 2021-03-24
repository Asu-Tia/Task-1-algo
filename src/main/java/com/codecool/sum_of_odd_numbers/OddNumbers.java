package com.codecool.sum_of_odd_numbers;

import java.util.List;

public class OddNumbers {

    public static Integer sum(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            if (Math.abs(number) % 2 == 1) {
                sum += number;
            }
        }
        return sum;
    }
}