package dev.thinke.domain.data.graph;

import java.util.ArrayList;
import java.util.List;

public class GraphOperations<T extends Comparable<T>> {

  private final Graph<T> graph;

  public GraphOperations(Integer maxV, Boolean isDirected) {
    graph = new Graph<>();
    graph.nVertices = 0;
    graph.nEdges = 0;
    graph.directed = isDirected;
    graph.degree = new ArrayList<>(maxV);
    graph.edges = new ArrayList<>(maxV);
    for (int i = 1; i <= maxV; i++) {
      graph.degree.set(i, 0);
      graph.edges.set(i, null);
    }
  }

  public void traverse() {}

  private static class Graph<T> {
    public List<Edge<T>> edges;
    public List<Integer> degree;
    public Integer nVertices;
    public Integer nEdges;
    public Boolean directed;
  }

  private static class Edge<T> {
    public Edge<T> next;
    public Integer weight;
    public Integer y;
  }

  private static enum VertexStatus {
    UNDISCOVERED, // initial state, has not been visited
    DISCOVERED, // found but has not had edges processed
    PROCESSED; // processed all edges
  }
}
