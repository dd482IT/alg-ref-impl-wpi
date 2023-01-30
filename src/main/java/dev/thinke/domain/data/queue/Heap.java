package dev.thinke.domain.data.queue;

import java.util.ArrayList;
import java.util.List;

public class Heap<T extends Comparable<T>> implements PriorityQueue<T> {

  private final List<T> items;

  public Heap() {
    this.items = new ArrayList<>();
  }

  public Heap(final List<T> items) {
    this.items = items;
  }

  @Override
  public void insert(T item) {}

  @Override
  public T extractMin() {
    return null;
  }
}
