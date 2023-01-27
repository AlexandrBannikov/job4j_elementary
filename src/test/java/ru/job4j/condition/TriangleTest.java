package ru.job4j.condition;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean rsl = Triangle.exist(ab, ac, bc);
        assertThat(rsl).isTrue();
    }

    @Test
    public void whenNotExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 5.0;
        boolean rsl = Triangle.exist(ab, ac, bc);
        assertThat(rsl).isFalse();
    }
}