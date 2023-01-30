package dev.thinke.domain.data.type;

public abstract class SinglyLinkedSortedDictionary<K extends Comparable<K>, V>
    extends SortedDictionary<K, V> {
  /**
   * @param key
   * @return
   */
  @Override
  public V search(K key) {
    return super.search(key);
  }

  /**
   * @param key
   * @param value
   */
  @Override
  public void insert(K key, V value) {
    super.insert(key, value);
  }

  /**
   * @param key
   */
  @Override
  public void delete(K key) {
    super.delete(key);
  }

  /**
   * @return
   */
  @Override
  public V max() {
    return super.max();
  }

  /**
   * @return
   */
  @Override
  public V min() {
    return super.min();
  }

  /**
   * @param key
   * @return
   */
  @Override
  public V previous(K key) {
    return super.previous(key);
  }

  /**
   * @param key
   * @return
   */
  @Override
  public V next(K key) {
    return super.next(key);
  }
}
