package com.epam.training.student_Samvel_Danielyan.max;

import java.util.OptionalInt;

public class MaxMethod {

    public static OptionalInt max(int[] values) {
        if (values == null || values.length == 0) {
            return OptionalInt.empty();
        }
        int result = values[0];
        for (int current : values) {
            if (current > result) {
                result = current;
            }
        }
        return OptionalInt.of(result);
    }
}
