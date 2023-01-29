package ru.job4j.loop;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CounterTest {

    @Test
    public void when0To5() {
        int start = 0;
        int finish = 5;
        int expected = 15;
        int output = Counter.sum(start, finish);
        assertThat(expected).isEqualTo(output);
    }

    @Test
    public void when3To9() {
        int start = 3;
        int finish = 4;
        int out = Counter.sum(start, finish);
        int expected = 7;
        assertThat(expected).isEqualTo(out);
    }

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(expected).isEqualTo(result);
    }

    @Test
    public void whenSumEven4to10Then() {
        int start = 4;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 28;
        assertThat(expected).isEqualTo(result);
    }
}