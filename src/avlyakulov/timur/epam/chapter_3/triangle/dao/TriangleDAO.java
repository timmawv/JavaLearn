package avlyakulov.timur.epam.chapter_3.triangle.dao;

import avlyakulov.timur.epam.chapter_3.triangle.db.TriangleDB;
import avlyakulov.timur.epam.chapter_3.triangle.entity.Triangle;

public class TriangleDAO {
    public void createTriangle (Triangle triangle) {
        TriangleDB.getInstance().createTriangle(triangle);
    }
    public Triangle [] findAll () {
        return TriangleDB.getInstance().findAll();
    }
    public void checkTriangleType () {
        TriangleDB.getInstance().checkTypeTriangle();
    }
    public String checkType (Triangle triangle) {
        return TriangleDB.getInstance().checkType(triangle);
    }
}
