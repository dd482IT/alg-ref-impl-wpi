package dev.thinke.domain.sort.alg;

import java.util.concurrent.atomic.AtomicInteger;

public class Cursor {
  private final AtomicInteger index;
  private final Direction direction;

  public Cursor(Integer start, Direction direction) {
    this.index = new AtomicInteger();
    this.index.set(start);
    this.direction = direction;
  }

  public Integer next() {
    return this.index.addAndGet(direction.delta());
  }

  public Integer current() {
    return this.index.get();
  }
}
