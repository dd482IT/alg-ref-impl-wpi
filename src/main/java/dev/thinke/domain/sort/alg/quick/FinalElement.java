package dev.thinke.domain.sort.alg.quick;

public record FinalElement(Integer index) implements Movable {
  @Override
  public Integer finalIndex() {
    return this.index();
  }

  @Override
  public Boolean inFinalPosition() {
    return Boolean.TRUE;
  }
}
