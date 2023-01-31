package ru.job4j.array;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap0To3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void when2To3() {
        int[] input = {1, 2, 3, 4, 7, 23, 12};
        int source = 1;
        int dest = input.length - 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 7, 3, 4, 2, 23, 12};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void when0To3() {
        int[] input = {1, 2, 3, 4, 7, 23, 12};
        int source = 0;
        int dest = input.length - 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1, 7, 23, 12};
        assertThat(result).containsExactly(expected);
    }
}