package dev.thinke.domain.data.graph;

public class Direction {

  private final Boolean isDirected;

  private Vertex source, dest;

  public Direction() {
    this.isDirected = Boolean.FALSE;
  }

  public Direction(final Vertex source, final Vertex dest) {
    this.source = source;
    this.dest = dest;
    this.isDirected = Boolean.TRUE;
  }

  public Boolean isDirected() {
    return this.isDirected;
  }

  public Vertex getSource() {
    return source;
  }

  public Vertex getDest() {
    return dest;
  }
}
