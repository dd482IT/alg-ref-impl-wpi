package dev.thinke.domain.sort.alg.shell;

import dev.thinke.domain.sort.type.InPlace;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.List;

public class Shell<T extends Comparable<T>> implements InPlace<T> {

    @Override
    public List<T> sort(final List<T> items) {
        final int[] shells = new int[]{6, 3, 1};
        final int n = items.size();
        for (int shell : shells) {
            for (int i = 0; i < n; i++) {
                for (int s = 0; s < n; s += shell) {
                    int next = s + shell;
                    if (next >= n) {
                        break;
                    }
                    T nextValue = items.get(next);
                    T currentValue = items.get(s);
                    int comparison = currentValue.compareTo(nextValue);
                    if (comparison > 0) {
                        items.set(s, nextValue);
                        items.set(next, currentValue);
                    }
                }
            }
        }
        return items;
    }
}
