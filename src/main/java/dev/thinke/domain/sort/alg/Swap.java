package dev.thinke.domain.sort.alg;

import java.util.function.BiConsumer;

public class Swap<T> implements BiConsumer<Pair, Index<T>> {
  @Override
  public void accept(Pair pair, Index<T> items) {
    items.swap(pair.left(), pair.right());
  }
}
