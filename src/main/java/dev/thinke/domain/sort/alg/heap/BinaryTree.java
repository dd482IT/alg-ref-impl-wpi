package dev.thinke.domain.sort.alg.heap;

public interface BinaryTree<T> {
  T parent(Integer k);

  T leftChild(Integer k);

  T rightChild(Integer k);
}
