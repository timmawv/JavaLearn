package avlyakulov.timur.epam.chapter_11.example.stream.streamfull.entity;

import java.util.HashSet;
import java.util.Set;

public class Department {
    private final int id;
    private final int parent;
    private final String name;

    private Set<Department> child = new HashSet<>();

    public Department(int id, int parent, String name) {
        this.id = id;
        this.parent = parent;
        this.name = name;
    }
}