package ru.job4j.condition;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SwitchWeekTest {

    @Test
    public void nameOfDay() {
        int in = 2;
        String output = SwitchWeek.nameOfDay(in);
        String expected = "Вторник";
        assertThat(output).isEqualTo(expected);
    }
}