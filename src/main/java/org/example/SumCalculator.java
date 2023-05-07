package org.example;

public class SumCalculator {
    public int sum(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Число повинно бути більше за нуль!");
        }

        return (number * (number + 1)) / 2;
    }
}
