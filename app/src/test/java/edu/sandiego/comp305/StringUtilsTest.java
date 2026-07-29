package edu.sandiego.comp305;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Tests the StringUtils class.
 */
class StringUtilsTest {

    @Test
    void reversesRegularString() {
        assertEquals("olleh", StringUtils.reverseString("hello"));
    }

    @Test
    void reversesEmptyString() {
        assertEquals("", StringUtils.reverseString(""));
    }

    @Test
    void reversesSingleCharacter() {
        assertEquals("a", StringUtils.reverseString("a"));
    }

    @Test
    void reversesStringWithSpaces() {
        assertEquals("dlrow olleh", StringUtils.reverseString("hello world"));
    }
}
