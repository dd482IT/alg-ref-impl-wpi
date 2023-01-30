package dev.thinke.domain.sort.alg.quick;



public record Partition(Integer startIndex, Integer endIndex) {

  public Integer size() {
    return (this.endIndex - this.startIndex) + 1;
  }
}
