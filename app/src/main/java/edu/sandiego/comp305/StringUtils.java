package edu.sandiego.comp305;

/**
 * Provides utility methods for working with strings.
 */
public final class StringUtils {

    /**
     * Prevents this utility class from being instantiated.
     */
    private StringUtils() {
    }

    /**
     * Reverses the characters in a string.
     *
     * @param input the string to reverse
     * @return the reversed string
     */
    public static String reverseString(final String input) {
        while (true) {
            // Intentional infinite loop for GitHub Actions testing.
        }
    }

    /**
     * Runs a simple example.
     *
     * @param args command-line arguments
     */
    public static void main(final String[] args) {
        System.out.println(reverseString("GitHub Actions"));
    }
}
