package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void whenNumberBiggerThan0_thenTrue() {
        assertTrue(Main.biggerThan0(5));
    }

    @Test
    void whenNumberSmallerThan0_thenFalse() {
        assertFalse(Main.biggerThan0(-5));
    }

    @Test
    void whenNumberSquared_thenCorrect() {
        assertEquals(25, Main.squared(5));
    }

    @Test
    void whenNumberSquared_thenIncorrect() {
        assertNotEquals(24, Main.squared(5));
    }
}