package avlyakulov.timur.epam.chapter_6.example.generic.entity;

import avlyakulov.timur.epam.chapter_6.example.entity.AbstractShape;

public interface ShapeGeneric <T extends AbstractShape> {
    double computeSquare (T shape);
    double computePerimeter (T shape);
}
