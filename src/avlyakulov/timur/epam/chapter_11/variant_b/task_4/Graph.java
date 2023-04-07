package avlyakulov.timur.epam.chapter_11.variant_b.task_4;
//Реализовать класс Graph, представляющий собой неориентированный
//граф. В конструкторе класса передается количество вершин в графе.
//Методы должны поддерживать быстрое добавление и удаление ребер.

import java.util.HashMap;
import java.util.Map;

public class Graph {
    private Map<Vertex, Map<Vertex, Integer>> adjVertices;

    public Graph(Map<Vertex, Map<Vertex, Integer>> adjVertices) {
        this.adjVertices = adjVertices;
    }

    public Map<Vertex, Map<Vertex, Integer>> getAdjVertices() {
        return adjVertices;
    }

    public void setAdjVertices(Map<Vertex, Map<Vertex, Integer>> adjVertices) {
        this.adjVertices = adjVertices;
    }

    void addVertex(String label) {
        adjVertices.putIfAbsent(new Vertex(label), new HashMap<>());
    }

    void removeVertex(String label) {
        Vertex v = new Vertex(label);
        adjVertices.values().stream().forEach(e -> e.remove(v));
        adjVertices.remove(new Vertex(label));
    }
}