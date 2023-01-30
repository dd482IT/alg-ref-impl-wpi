package dev.thinke.domain.data.type;

public interface PriorityQueue<K extends Comparable<K>, V> extends Dictionary<K, V> {
  V max();

  V min();

  V previous(K key);

  V next(K key);
}
