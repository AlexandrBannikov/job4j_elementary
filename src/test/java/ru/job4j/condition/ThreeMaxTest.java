package ru.job4j.condition;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ThreeMaxTest {

    @Test
    public void firstMax() {
        int first = 10;
        int second = 7;
        int third = 4;
        int expected = 10;
        int out = ThreeMax.max(first, second, third);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void secondMax() {
        int first = 2;
        int second = 5;
        int third = 4;
        int expected = 5;
        int out = ThreeMax.max(first, second, third);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void thirdMax() {
        int first = 3;
        int second = 4;
        int third = 5;
        int expected = 5;
        int out = ThreeMax.max(first, second, third);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void allEq() {
        int first = 1;
        int second = 1;
        int third = 1;
        int result = ThreeMax.max(first, second, third);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void firstEqSecond() {
        int first = 10;
        int second = 10;
        int third = 1;
        int result = ThreeMax.max(first, second, third);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void firstEqThird() {
        int first = 100;
        int second = 1;
        int third = 100;
        int result = ThreeMax.max(first, second, third);
        int expected = 100;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void secondEqThird() {
        int first = 1;
        int second = 100;
        int third = 100;
        int result = ThreeMax.max(first, second, third);
        int expected = 100;
        assertThat(result).isEqualTo(expected);
    }
}