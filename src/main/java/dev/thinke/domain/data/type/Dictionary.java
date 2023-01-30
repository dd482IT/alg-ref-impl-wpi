package dev.thinke.domain.data.type;

import dev.thinke.domain.util.Math;

public interface Dictionary<K extends Comparable<K>, V> {
  V search(K key);

  void insert(K key, V value);

  void delete(K key);

  Integer size();

  default int deriveKey(Object key) {
    return Math.hash(key) % size();
  }
}
