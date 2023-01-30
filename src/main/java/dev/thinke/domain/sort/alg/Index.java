package dev.thinke.domain.sort.alg;

import java.util.List;

public record Index<T>(List<T> items) {

  private Integer index(final Integer key) {
    return key - 1;
  }

  public T retrieve(final Integer key) {
    return this.items().get(index(key));
  }

  public T retrieveFirst() {
    return items().get(0);
  }

  public void assign(final Integer key, final T element) {
    this.items().set(index(key), element);
  }

  public Integer add(final T element) {
    items().add(element);
    return items().size();
  }

  public void swap(Integer first, Integer second) {
    final T firstItem = items.get(index(first));
    final T secondItem = items.get(index(second));
    items.set(index(first), secondItem);
    items.set(index(second), firstItem);
  }
}
