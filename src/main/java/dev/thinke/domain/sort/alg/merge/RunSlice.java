package dev.thinke.domain.sort.alg.merge;

import java.util.List;

public class RunSlice {

  private final Run left;
  private final Run right;

  public RunSlice(final List<?> items) {
    int n = items.size() / 2;
    this.left = new Run(0, n - 1);
    this.right = new Run(n, items.size() - 1);
  }

  public Run getLeft() {
    return left;
  }

  public Run getRight() {
    return right;
  }
}
