package dev.thinke.domain.data.queue;

public interface PriorityQueue<T extends Comparable<T>> {

  void insert(T item);

  T extractMin();
}
