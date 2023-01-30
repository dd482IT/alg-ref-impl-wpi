package dev.thinke.domain.sort.alg.heap;

import dev.thinke.domain.sort.alg.Index;
import dev.thinke.domain.sort.type.InPlace;
import java.util.ArrayList;
import java.util.List;

public class MinHeap<T extends Comparable<T>>
    implements PriorityQueue<T>, BinaryTree<T>, InPlace<T> {

  private final Index<T> items;
  private Integer n;

  public MinHeap(final Integer size) {
    this.items = new Index<>(new ArrayList<>(size));
    this.n = size;
  }

  public MinHeap(final List<T> items) {
    this.items = new Index<>(new ArrayList<>(items.size()));
    this.n = 0;
    items.forEach(this::insert);
  }

  @Override
  public void insert(T element) {
    items.add(element);
    this.n++;
    bubbleUp(lastIndex());
  }

  @Override
  public T extractMin() {
    if (this.n > 0) {
      T item = items.retrieveFirst();
      items.assign(firstIndex(), items.retrieve(lastIndex()));
      items.assign(lastIndex(), null);
      this.n--;
      bubbleDown(firstIndex());
      return item;
    } else {
      return null;
    }
  }

  @Override
  public T parent(Integer k) {
    final var parentI = parentIndex(k);
    if (parentI.equals(-1)) {
      return null;
    }
    return items.retrieve(parentI);
  }

  // young child
  @Override
  public T leftChild(Integer k) {
    return items.retrieve(leftChildIndex(k));
  }

  @Override
  public T rightChild(Integer k) {
    return items.retrieve(rightChildIndex(k));
  }

  @Override
  public List<T> sort(List<T> original) {
    for (int i = 0; i < original.size(); i++) {
      original.set(i, extractMin());
    }
    return original;
  }

  // since parents should be less than their children in a min-heap, swap if parent is greater than
  // k
  // then repeat for the new item at the parent index (now k)
  // hence we bubble up to the top of the heap, the most minimum element
  private void bubbleUp(Integer k) {
    final T parent = parent(k);
    if (parent == null) {
      return;
    }
    if (parent.compareTo(items.retrieve(k)) > 0) {
      final var parentI = parentIndex(k);
      items.swap(k, parentI);
      bubbleUp(parentI);
    }
  }

  // since parents should be less than their children in a min-heap
  // when we replace an element not on the bottom level, we should compare it to its children
  // if it doesn't dominate both of them, we swap it with the most minimum of the two and continue
  // down
  private void bubbleDown(Integer k) {
    int child = leftChildIndex(k);
    var minChild = k;
    for (int i = 0; i <= 1; i++) {
      if ((child + i) <= this.n) {
        if (items.retrieve(minChild).compareTo(items.retrieve(child + i)) > 0) {
          minChild = child + i;
        }
      }
    }
    if (!minChild.equals(k)) {
      items.swap(k, minChild);
      bubbleDown(minChild);
    }
  }

  private Integer firstIndex() {
    return 1;
  }

  private Integer lastIndex() {
    return this.n;
  }

  private Integer parentIndex(final Integer k) {
    if (k == 1) {
      return -1;
    }
    return k / 2;
  }

  private Integer leftChildIndex(final Integer k) {
    return k * 2;
  }

  private Integer rightChildIndex(final Integer k) {
    return (k * 2) + 1;
  }
}
