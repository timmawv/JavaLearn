package avlyakulov.timur.epam.chapter_3.circle.service;

import avlyakulov.timur.epam.chapter_3.circle.dao.CircleDAO;
import avlyakulov.timur.epam.chapter_3.circle.entity.Circle;

public class CircleService {
    private final CircleDAO circleDAO = new CircleDAO();

    public void createCircle (Circle circle) {
        circleDAO.createCircle(circle);
    }
    public double findSquare (Circle circle) {
        return circleDAO.findSquare(circle);
    }
    public double findPerimeter (Circle circle) {
        return circleDAO.findPerimeter(circle);
    }
    public void findMaxAndMinCircle (Circle[] circles) {
        circleDAO.findMaxAndMinCircle(circles);
    }
    public Circle[] findAll () {
        return circleDAO.findAll();
    }
}