package dev.thinke.domain.data.tree;

import com.google.common.base.Objects;
import dev.thinke.domain.data.type.DictionaryItem;

class Tree<K extends Comparable<K>, V> {
  public Tree<K, V> parent, left, right;
  public DictionaryItem<K, V> data;
  public NodeType nodeType;

  public Boolean isLeaf() {
    return (left == null) && (right == null);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Tree<?, ?> tree = (Tree<?, ?>) o;
    return Objects.equal(data, tree.data);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(data);
  }
}
