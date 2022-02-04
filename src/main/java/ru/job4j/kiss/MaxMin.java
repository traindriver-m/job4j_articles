package ru.job4j.kiss;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MaxMin {

    public <T> T max(List<T> value, Comparator<T> comparator) {
        return iterator(value, comparator, s -> s > 0);
    }

    public <T> T min(List<T> value, Comparator<T> comparator) {
        return iterator(value, comparator, s -> s < 0);
    }

    public <T> T iterator(List<T> value, Comparator<T> comparator, Predicate<Integer> predicate) {
        T result = value.get(0);
        for (T element : value) {
            if (predicate.test(comparator.compare(element, result))) {
                result = element;
            }
        }
        return result;
    }
}


