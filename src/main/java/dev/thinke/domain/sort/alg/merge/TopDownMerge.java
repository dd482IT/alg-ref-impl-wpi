package dev.thinke.domain.sort.alg.merge;

import com.google.common.collect.ImmutableList;
import dev.thinke.domain.sort.type.NotInPlace;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TopDownMerge<T extends Comparable<T>> implements NotInPlace<T> {

    private RunStrategy runStrategy;

    public TopDownMerge() {}

    public TopDownMerge(final RunStrategy runStrategy) {
        this.runStrategy = runStrategy;
    }

    public List<T> sort(final List<T> items) {
        final int n = items.size();
        if (n <= 1) {
            return items;
        }
        final var runs = new RunSlice(items);
        final List<T> left = sort(runs.getLeft().deriveRun(items));
        final List<T> right = sort(runs.getRight().deriveRun(items));
        return new ArrayList<T>(merge(left, right));
    }

    private List<T> merge(final List<T> left, final List<T> right) {
        final int totalLength = left.size() + right.size();
        final var workingItems = new ArrayList<T>(totalLength);
        while (!left.isEmpty() && !right.isEmpty()) {
            final T leftItem = left.get(0);
            final T rightItem = right.get(0);
            final int comp = leftItem.compareTo(rightItem);
            if (comp >= 0) {
                workingItems.add(rightItem);
                right.remove(0);
            } else {
                workingItems.add(leftItem);
                left.remove(0);
            }
        }
        while (!left.isEmpty()) {
            workingItems.add(left.remove(0));
        }
        while (!right.isEmpty()) {
            workingItems.add(right.remove(0));
        }
        return workingItems;
    }
}
