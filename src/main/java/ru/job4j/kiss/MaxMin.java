package ru.job4j.kiss;

import java.util.Comparator;
import java.util.List;

public class MaxMin {

    public <T> T max(List<T> value, Comparator<T> comparator) {
        return iterator(value, comparator, true);
    }

    public <T> T min(List<T> value, Comparator<T> comparator) {
        return iterator(value, comparator, false);
    }

    public <T> T iterator(List<T> value, Comparator<T> comparator, boolean requirement) {
        T minimum = value.get(0);
        T maximum = minimum;
        for (T element : value) {
            if (comparator.compare(element, minimum) < 0) {
                minimum = element;
            } else if (comparator.compare(element, maximum) > 0) {
                maximum = element;
            }
        }
        return requirement ? maximum : minimum;
    }
}


