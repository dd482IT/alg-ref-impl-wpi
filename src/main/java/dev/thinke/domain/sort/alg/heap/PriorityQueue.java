package dev.thinke.domain.sort.alg.heap;

public interface PriorityQueue<T extends Comparable<T>> {
  void insert(T element);

  T extractMin();
}
