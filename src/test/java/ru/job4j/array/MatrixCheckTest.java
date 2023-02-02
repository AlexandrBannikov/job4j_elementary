package ru.job4j.array;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };
        int expected = 1;
        boolean result = MatrixCheck.monoHorizontal(input, expected);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', ' '},
        };
        int column = 1;
        boolean result = MatrixCheck.monoHorizontal(input, column);
        assertThat(result).isFalse();
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {'X', ' ', ' '},
                {'X', ' ', ' '},
                {'X', ' ', ' '},
        };
        int column = 0;
        boolean result = MatrixCheck.monoVertical(input, column);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotHasMonoVertical() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', ' ', ' '},
                {'X', ' ', ' '},
        };
        int column = 0;
        boolean result = MatrixCheck.monoVertical(input, column);
        assertThat(result).isFalse();
    }
}