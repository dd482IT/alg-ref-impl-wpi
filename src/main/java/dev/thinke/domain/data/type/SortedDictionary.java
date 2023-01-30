package dev.thinke.domain.data.type;

public abstract class SortedDictionary<K extends Comparable<K>, V> implements PriorityQueue<K, V> {
  /**
   * O(log n) Can use binary search
   *
   * @param key
   * @return
   */
  @Override
  public V search(K key) {
    return null;
  }

  /**
   * O(n) Insertion index must be found by comparing keys sequentially Although you can use binary
   * search to find the insertion index (O(log n)) Moving elements to accommodate the new one takes
   * linear time
   *
   * @param key
   * @param value
   */
  @Override
  public void insert(K key, V value) {}

  /**
   * O(n log n) Again, moving elements to accommodate the deleted one takes linear time The book
   * says this is linear, but that's because the parameter is a reference to the element to remove
   * This API is linearithmic because you must first search for the index to delete, which is
   * logarithmic The actual removal is linear You can also cheat by simply overwriting the specified
   * key with null and decrementing n This changes the actual removal operation to constant But you
   * still have to find the index
   *
   * @param key
   */
  @Override
  public void delete(K key) {}

  /**
   * O(1)
   *
   * @return
   */
  @Override
  public V max() {
    return null;
  }

  /**
   * O(1)
   *
   * @return
   */
  @Override
  public V min() {
    return null;
  }

  /**
   * O(1)
   *
   * @return
   */
  @Override
  public V previous(K key) {
    return null;
  }

  /**
   * O(1)
   *
   * @return
   */
  @Override
  public V next(K key) {
    return null;
  }
}
