package Realization;

import Annotation.Sum;

public class MyMethod {
    @Sum(value1 = 1, value2 = 2)
    public int sum(int value1, int value2) {
        return value1 + value2;
    }
}
