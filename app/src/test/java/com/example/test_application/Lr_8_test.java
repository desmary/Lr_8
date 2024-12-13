package com.example.test_application;

import static org.junit.Assert.*;
import org.junit.Test;

public class Lr_8_test {

    // Тести для пошуку мінімального елемента

    // Перевіряє мінімальне додатне значення в масиві позитивних чисел {3, 5, 1, 7}
    // Позитивний тест
    @Test
    public void testFindMinPositive() {
        int[] array = {3, 5, 1, 7};
        assertEquals(1, Lr_8.findMinPositive(array));
    }
    // Перевіряє, чи метод виводить виняток при відсутності додатних чисел у масиві {-3, -5, -1, -7}
    // Негативний тест
    @Test(expected = IllegalArgumentException.class)
    public void testFindMinPositiveWithNoPositives() {
        int[] array = {-3, -5, -1, -7};
        Lr_8.findMinPositive(array);
    }

    // Тести для суми від’ємних чисел

    // Перевіряє, чи сума від'ємних чисел у масиві {-3, -5, -7} дорівнює -15
    // Позитивний тест
    @Test
    public void testSumNegativeArray() {
        int[] array = {-3, -5, -7};
        assertEquals(-15, Lr_8.sumNegativeArray(array));
    }

    // Перевіряє, чи метод виводить виняток, якщо масив містить додатні числа {3, -5, -7}
    // Негативний тест
    @Test(expected = IllegalArgumentException.class)
    public void testSumNegativeArrayWithPositiveNumbers() {
        int[] array = {3, -5, -7};
        Lr_8.sumNegativeArray(array);
    }

    // Тести для послідовності Фібоначчі

    // Перевіряє, чи правильно обчислюються значення Фібоначчі для входів 0, 1, 8
    // Позитивний тест
    @Test
    public void testFibonacci() {
        assertEquals(0, Lr_8.fibonacci(0));
        assertEquals(1, Lr_8.fibonacci(1));
        assertEquals(21, Lr_8.fibonacci(8));
    }

    // Перевіряє, чи метод виводить виняток для від'ємного значення -1
    // Негативний тест
    @Test(expected = IllegalArgumentException.class)
    public void testFibonacciWithNegative() {
        Lr_8.fibonacci(-1);
    }

    // Тести для сили струму

    // Перевіряє правильність обчислення сили струму для валідних вхідних значень 10 (напруга) і 5 (опір)
    // Позитивний тест
    @Test
    public void testCalculateCurrent() {
        assertEquals(2.0, Lr_8.calculateCurrent(10, 5), 0.01);
    }
    // Перевіряє, чи метод кидає виняток при нульовому опорі (ділення на нуль)
    // Негативний тест
    @Test(expected = IllegalArgumentException.class)
    public void testCalculateCurrentWithZeroResistance() {
        Lr_8.calculateCurrent(10, 0);
    }
}

