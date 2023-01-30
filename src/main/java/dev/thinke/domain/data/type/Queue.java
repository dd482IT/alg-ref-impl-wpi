package dev.thinke.domain.data.type;

/**
 * FIFO
 *
 * @param <T>
 */
public interface Queue<T> {
  void enqueue(T x);

  T dequeue();
}
