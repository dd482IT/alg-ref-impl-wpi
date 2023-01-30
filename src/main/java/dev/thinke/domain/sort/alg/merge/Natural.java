package dev.thinke.domain.sort.alg.merge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Natural implements RunStrategy {

  @Override
  public <T> List<Run> createRuns(final List<T> original) {
    final var runs = new LinkedList<Run>();
    final int n = original.size();
    final var items = new ArrayList<T>(n);
    final int endOfLastRun = 0;
    for (int i = 0; i < n; i++) {
      T item = original.get(i);
      int currentRun = i - 0;
      for (int s = endOfLastRun; s <= i; s++) {}
    }
    return runs;
  }
}
