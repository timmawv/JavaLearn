package avlyakulov.timur.epam.chapter_6.example.entity.generic;

import avlyakulov.timur.epam.chapter_6.example.entity.AbstractShape;

public interface ShapeGeneric <T extends AbstractShape> {
    double computerSquare (T shape);
    double computerPerimeter (T shape);
}