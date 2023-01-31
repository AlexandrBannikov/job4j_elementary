package ru.job4j.array;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] array = new int[] {5, 10, 3};
        int element = 5;
        int result = FindLoop.indexOf(array, element);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHasNot1ThenMinus1() {
        int[] data = new int[] {3, 23, 14};
        int element = 1;
        int result = FindLoop.indexOf(data, element);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}