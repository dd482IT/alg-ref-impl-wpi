package dev.thinke.domain.sort.alg.insertion;

import dev.thinke.domain.sort.type.InPlace;
import java.util.List;
import org.checkerframework.checker.nullness.qual.NonNull;

public class Insertion<T extends Comparable<T>> implements InPlace<T> {

  @Override
  public List<T> sort(final @NonNull List<T> items) {
    final int n = items.size();
    for (int i = 0; i < n; i++) {
      for (int s = i; s > 0; s--) {
        int next = s - 1;
        T nextValue = items.get(next);
        T currentValue = items.get(s);
        int comparison = currentValue.compareTo(nextValue);
        if (comparison < 0) {
          items.set(s, nextValue);
          items.set(next, currentValue);
        } else {
          break;
        }
      }
    }
    return items;
  }
}
