package ru.job4j.kiss;

import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;
import java.util.List;

public class MaxMinTest {

    @Test
    public void whenNumIsMax() {
        MaxMin maxMin = new MaxMin();
        List<Integer> integers = List.of(2, 1, 4, 1, 89, 34, 16, 3, 22, 89, 8);
        int expexted = 89;
        int result = maxMin.max(integers, Integer::compareTo);
        Assert.assertEquals(expexted, result);
    }

    @Test
    public void whenStringIsMax() {
        MaxMin maxMin = new MaxMin();
        List<String> strings = List.of("Acd", "Bcd", "Bad", "Bcf", "Abc");
        String expexted = "Bcf";
        String result = maxMin.max(strings, Comparator.naturalOrder());
        Assert.assertEquals(expexted, result);
    }

    @Test
    public void whenNumIsMin() {
        MaxMin maxMin = new MaxMin();
        List<Integer> integers = List.of(2, 1, 4, 1, 89, 34, 16, 3, 22, 89, 8);
        int expexted = 1;
        int result = maxMin.min(integers, Integer::compareTo);
        Assert.assertEquals(expexted, result);
    }

    @Test
    public void whenStringIsMin() {
        MaxMin maxMin = new MaxMin();
        List<String> strings = List.of("Acd", "Bcd", "Bad", "Bcf", "Abc");
        String expexted = "Abc";
        String result = maxMin.min(strings, Comparator.naturalOrder());
        Assert.assertEquals(expexted, result);
    }
}