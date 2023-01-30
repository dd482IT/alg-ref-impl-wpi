package dev.thinke.domain.data.type;

public abstract class UnsortedDictionary<K extends Comparable<K>, V>
    implements PriorityQueue<K, V> {
  /**
   * O(n) Must potentially compare against every element (sequential search)
   *
   * @param key
   * @return
   */
  @Override
  public V search(K key) {
    return null;
  }

  /**
   * O(1) Insertion index doesn't matter, just add to the end and increment n
   *
   * @param key
   * @param value
   */
  @Override
  public void insert(K key, V value) {}

  /**
   * O(n) The book says this is constant time, but only because the parameter is a reference to the
   * element to remove If the parameter is just a key, as in this case, you must first search for
   * the removal index (O(n)) Most unsorted implementations use a linked list, however, so once you
   * find the index, removal is constant
   *
   * @param key
   */
  @Override
  public void delete(K key) {}

  /**
   * O(n)
   *
   * @return
   */
  @Override
  public V max() {
    return null;
  }

  /**
   * O(n)
   *
   * @return
   */
  @Override
  public V min() {
    return null;
  }

  /**
   * O(n)
   *
   * @return
   */
  @Override
  public V previous(K key) {
    return null;
  }

  /**
   * O(n)
   *
   * @return
   */
  @Override
  public V next(K key) {
    return null;
  }
}
