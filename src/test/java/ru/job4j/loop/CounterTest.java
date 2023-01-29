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
        int finish = 9;
        int out = Counter.sum(start, finish);
        int expected = 45;
        assertThat(expected).isEqualTo(out);
    }
}