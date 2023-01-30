package dev.thinke.domain.sort.type;

import java.util.List;

@FunctionalInterface
public interface NotInPlace<T extends Comparable<T>> {

  List<T> sort(List<T> list);
}
