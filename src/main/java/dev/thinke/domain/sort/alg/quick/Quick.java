package dev.thinke.domain.sort.alg.quick;

import dev.thinke.domain.sort.alg.Index;
import dev.thinke.domain.sort.type.InPlace;

import java.util.*;

public class Quick<T extends Comparable<T>> implements InPlace<T> {

    private final PartitionStrategy partitionStrategy;

    public Quick(final PartitionStrategy partitionStrategy) {
        this.partitionStrategy = partitionStrategy;
    }
    @Override
    public List<T> sort(final List<T> items) {
        sort(items, new Partition(1, items.size()));
        return items;
    }

//    public Pivot partition(final List<T> items, final Partition partition) {
//        int lo = partition.startIndex();
//        int hi = partition.endIndex() + 1;
//        T pivotItem = items.get(lo);
//        while (true) {
//            while (less(items.get(++lo), pivotItem)) {
//                if (lo == hi) break;
//            }
//            while (less(items.get(--hi), pivotItem)) {
//                if (hi == lo) break;
//            }
//            if (lo >= hi) break;
//            swap(lo, hi, items);
//        }
//        swap(partition.startIndex(), hi, items);
//        return new Pivot(hi);
//    }

    public Pivot partition(final List<T> items, final Partition partition) {
        final var index = new Index<>(items);
        final Integer n = partition.size();
        final Integer pivotIndex = (defaultPartitionIndex(n) + partition.startIndex()) - 1;
        final T pivotItem = index.retrieve(pivotIndex);
        System.out.println("Initial pivot: (" + pivotIndex + "," + pivotItem.toString() + ")");
        final var lessThan = new LinkedList<Integer>();
        // TODO:  use this to manage pivot equality
        final var equalTo = new LinkedList<Integer>();
        final var greaterThan = new LinkedList<Integer>();
        for (int i = partition.startIndex(); i <= partition.endIndex(); i++) {
            int comp = index.retrieve(i).compareTo(pivotItem);
            if (comp < 0) {
                lessThan.add(i);
            } else if (comp > 0) {
                greaterThan.add(i);
            } else {
                equalTo.add(i);
            }
        }
        int nLessThan = (lessThan.size() + partition.startIndex()) - 1;
        final var finalPivot = new Pivot(nLessThan + 1);
        while (!greaterThan.isEmpty() && !lessThan.isEmpty() && (lessThan.peekLast() > nLessThan)) {
            swap(greaterThan.pollFirst(), lessThan.pollLast(), items);
        }
        if (!pivotIndex.equals(finalPivot.index())) {
            swap(pivotIndex, finalPivot.index(), items);
        }
        System.out.println("Final pivot: (" + finalPivot.index() + "," + pivotItem.toString() + ")");
        return finalPivot;
    }

    private Integer defaultPartitionIndex(int size) {
        switch (this.partitionStrategy) {
            case LAST -> {
                return size;
            }
            case MIDDLE -> {
                return size / 2;
            }
            default -> {
                return 1;
            }
        }
    }

    private boolean less(T comparer, T comparee) {
        System.out.println("Comparing " + comparer.toString() + " to " + comparee.toString());
        return comparer.compareTo(comparee) < 0;
    }

    private void sort(final List<T> items, final Partition partition) {
        System.out.println("Current partition: " + partition.toString());
        if (partition.size() < 2) {
            System.out.println("Returning because partition size < 2");
            return;
        }
        final var pivot = partition(items, partition);
        System.out.println(buildPrintString(items));
        System.out.println("Left side sort");
        sort(items, new Partition(partition.startIndex(), pivot.index() - 1));
        System.out.println("Right side sort");
        sort(items, new Partition(pivot.index() + 1, partition.endIndex()));
    }

    private String buildPrintString(List<T> items) {
        final var sb = new StringBuilder();
        sb.append('[');
        items.forEach(item -> sb.append(item.toString()).append(", "));
        sb.append(']');
        return sb.toString();
    }
}
