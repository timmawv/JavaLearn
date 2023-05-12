package avlyakulov.timur.epam.chapter_3.circle.dao;

import avlyakulov.timur.epam.chapter_3.circle.entity.Circle;
import avlyakulov.timur.epam.chapter_3.circle.db.CircleDB;

public class CircleDAO {

    public void createCircle(Circle circle){
        CircleDB.getInstance().createCircle(circle);
    }
    public double findSquare(Circle circle) {
        return CircleDB.getInstance().findSquare(circle);
    }
    public double findPerimeter(Circle circle) {
        return CircleDB.getInstance().findPerimeter(circle);
    }
    public void findMaxAndMinCircle (Circle[] circles) {
        CircleDB.getInstance().findMaxAndMinCircles(circles);
    }
    public Circle[] findAll() {
        return CircleDB.getInstance().findAll();
    }
}
