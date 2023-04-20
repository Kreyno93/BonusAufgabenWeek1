package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MainTest {

    @Test
    void printNumberFromArrayWithTest() {
        assertEquals("one", Main.printNumberFromArrayWithTest(1));
        assertEquals("two", Main.printNumberFromArrayWithTest(2));
        assertEquals("three", Main.printNumberFromArrayWithTest(3));
        assertEquals("four", Main.printNumberFromArrayWithTest(4));
        assertEquals("five", Main.printNumberFromArrayWithTest(5));
        assertEquals("six", Main.printNumberFromArrayWithTest(6));
        assertEquals("seven", Main.printNumberFromArrayWithTest(7));
        assertEquals("eight", Main.printNumberFromArrayWithTest(8));
        assertEquals("nine", Main.printNumberFromArrayWithTest(9));
        assertEquals("ten", Main.printNumberFromArrayWithTest(10));
    }



  
}