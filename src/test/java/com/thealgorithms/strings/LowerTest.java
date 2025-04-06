package com.thealgorithms.strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LowerTest {

    @Test
    public void toLowerCase() {
        String input1 = "hello world";
        String input2 = "HelLO WoRld";
        String input3 = "HELLO WORLD";

        assertEquals("hello world", Lower.toLowerCase(input1));
        assertEquals("hello world", Lower.toLowerCase(input2));
        assertEquals("hello world", Lower.toLowerCase(input3));
    }

    @Test
    public void toLowerCase_emptyString() {
        assertEquals("", Lower.toLowerCase(""));
    }

    @Test
    public void toLowerCase_specialCharactersAndNumbers() {
        assertEquals("123 !@# abc", Lower.toLowerCase("123 !@# ABC"));
    }

    @Test
    public void toLowerCase_longString() {
        String input = "A".repeat(1000);
        String expected = "a".repeat(1000);
        assertEquals(expected, Lower.toLowerCase(input));
    }

    @Test
    public void toLowerCase_nullInput() {
        assertThrows(NullPointerException.class, () -> {
            Lower.toLowerCase(null);
        });
    }
}
