package dev.thinke.domain.data.type;

/**
 * LIFO
 *
 * @param <T>
 */
public interface Stack<T> {
  void push(T x);

  T pop();
}
