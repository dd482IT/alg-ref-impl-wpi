package dev.thinke.domain.sort.alg.merge;

import java.util.List;

public interface RunStrategy {
  <T> List<Run> createRuns(List<T> original);
}
