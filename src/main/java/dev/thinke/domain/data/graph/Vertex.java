package dev.thinke.domain.data.graph;

public class Vertex implements Traversable {

  private final String label;

  private Boolean visited = Boolean.FALSE;

  public Vertex(final String label) {
    this.label = label;
  }

  public String getLabel() {
    return label;
  }

  @Override
  public Boolean getVisited() {
    return visited;
  }

  @Override
  public void visit() {
    this.visited = Boolean.TRUE;
  }
}
