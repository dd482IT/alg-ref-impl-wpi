package dev.thinke.domain.sort.alg.quick;

public record Element(Integer initialIndex, Integer finalIndex) implements Movable {
  @Override
  public Boolean inFinalPosition() {
    return Boolean.FALSE;
  }
}
