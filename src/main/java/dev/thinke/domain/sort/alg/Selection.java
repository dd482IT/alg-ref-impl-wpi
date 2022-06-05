package dev.thinke.domain.sort.alg;

import dev.thinke.domain.sort.type.InPlace;

import java.util.List;

public class Selection<T extends Comparable<T>> implements InPlace<T> {

    @Override
    public void sort(final List<T> items) {
        final int n = items.size();
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            T minValue = items.get(i);
            for (int s = i + 1; s < n; s++) {
                int comparison = items.get(minIndex).compareTo(items.get(s));
                if (comparison > 0) {
                    minIndex = s;
                    minValue = items.get(s);
                }
            }
            if (minIndex != i) {
                items.set(minIndex, items.get(i));
                items.set(i, minValue);
            }
        }
    }
}
