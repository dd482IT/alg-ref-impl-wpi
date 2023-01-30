package dev.thinke.domain.data.graph;

import java.util.HashMap;
import java.util.Map;

public class Edge implements Traversable {

  private final Vertex left, right;
  private final Direction direction;
  private final Map<String, Object> attributes;

  private Boolean visited = Boolean.FALSE;

  public Edge(final Vertex left, final Vertex right, final Direction direction) {
    this.left = left;
    this.right = right;
    this.direction = direction;
    this.attributes = new HashMap<>();
  }

  public Edge(
      final Vertex left,
      final Vertex right,
      final Direction direction,
      final Map<String, Object> attributes) {
    this.left = left;
    this.right = right;
    this.direction = direction;
    this.attributes = attributes;
  }

  public void addAttribute(final String key, final Object value) {
    this.attributes.put(key, value);
  }

  public Vertex getLeft() {
    return left;
  }

  public Vertex getRight() {
    return right;
  }

  public Direction getDirection() {
    return direction;
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
