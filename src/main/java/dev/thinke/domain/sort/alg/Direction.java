package dev.thinke.domain.sort.alg;

interface Direction {
  Integer delta();

  default Integer next(Integer i) {
    return i + delta();
  }
}
