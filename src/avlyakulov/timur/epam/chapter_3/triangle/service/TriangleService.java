package avlyakulov.timur.epam.chapter_3.triangle.service;

import avlyakulov.timur.epam.chapter_3.triangle.dao.TriangleDAO;
import avlyakulov.timur.epam.chapter_3.triangle.entity.Triangle;

public class TriangleService {
    private final TriangleDAO triangleDAO = new TriangleDAO();

    public void createTriangle (Triangle triangle) {
        triangleDAO.createTriangle(triangle);
    }
    public Triangle [] findAll() {
        return triangleDAO.findAll();
    }
    public void checkTriangleType () {
        triangleDAO.checkTriangleType();
    }
    public String checkType (Triangle triangle) {
        return triangleDAO.checkType(triangle);
    }
}