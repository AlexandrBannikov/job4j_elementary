package ru.job4j.array;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {

    @Test
    public void when5Numbers() {
        int[] data = {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void when3Numbers() {
        int[] data = {5, 3, 4};
        int[] result = SortSelected.sort(data);
        int[] expected = {3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void when9Numbers() {
        int[] data = {6, 3, 4, 7, 1, 8, 2, 5, 9};
        int[] result = SortSelected.sort(data);
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(result).containsExactly(expected);
    }
}