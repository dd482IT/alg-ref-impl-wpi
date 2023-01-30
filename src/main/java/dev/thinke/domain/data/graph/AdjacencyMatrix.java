package dev.thinke.domain.data.graph;

import java.util.ArrayList;
import java.util.HashMap;

public record AdjacencyMatrix(ArrayList<Vertex> vertices, HashMap<String, Integer> keyMap) {}
