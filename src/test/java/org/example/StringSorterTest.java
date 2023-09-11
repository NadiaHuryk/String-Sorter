package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import java.util.List;

class StringSorterTest {
    private final StringSorter sorter = new StringSorter();

    @Test
    public void testSortStringsWithEmptyInputList() {
        List<String> input = List.of();
        List<String> expected = sorter.sortStrings(input, "a");

        assertEquals(input, expected);
    }

    @Test
    public void testSortStrings() {
        StringSorter sorter = new StringSorter();
        List<String> input = List.of("apple", "banana", "grape", "avocado", "cherry");
        List<String> result = sorter.sortStrings(input, "a");
        List<String> expected = List.of("banana", "cherry", "grape", "avocado", "apple");

        assertEquals(expected, result);
    }
}