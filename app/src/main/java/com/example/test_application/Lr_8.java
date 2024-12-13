package com.example.test_application;

public class Lr_8 {

    // 1. Пошук мінімального елемента масиву позитивних чисел
    public static int findMinPositive(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (num > 0 && num < min) {
                min = num;
            }
        }
        if (min == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Array does not contain positive numbers.");
        }
        return min;
    }

    // 2. Розрахунок суми елементів масиву, який може складатися лише з від’ємних чисел
    public static int sumNegativeArray(int[] numbers) {
        for (int num : numbers) {
            if (num >= 0) {
                throw new IllegalArgumentException("Array contains non-negative numbers.");
            }
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    // 3. Алгоритм розрахунку N-го елемента послідовності Фібоначчі
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("N must be a non-negative integer.");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    // 4. Алгоритм розрахунку сили струму на ділянці кола (I = U / R)
    public static double calculateCurrent(double voltage, double resistance) {
        if (resistance <= 0) {
            throw new IllegalArgumentException("Resistance cannot be zero or lower.");
        }
        return voltage / resistance;
    }
}