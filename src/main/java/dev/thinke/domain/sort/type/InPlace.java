package dev.thinke.domain.sort.type;

import java.util.List;

@FunctionalInterface
public interface InPlace<T extends Comparable<T>> {

  List<T> sort(List<T> original);

  default void swap(Integer first, Integer second, List<T> items) {
    final T firstItem = items.get(first);
    final T secondItem = items.get(second);
    items.set(first, secondItem);
    items.set(second, firstItem);
  }
}
