package dev.thinke.domain.util;

public class Math {

  public static Integer hash(final Object key) {
    int h;
    return ((h = key.hashCode()) ^ (h >>> 16));
  }
}
