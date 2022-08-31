package avlyakulov.timur.epam.chapter_3.straight.service;

import avlyakulov.timur.epam.chapter_3.straight.dao.StraightDAO;
import avlyakulov.timur.epam.chapter_3.straight.entity.Straight;

public class StraightService {
     private final StraightDAO straightDAO = new StraightDAO();

     public void createStraight (Straight straight) {
         straightDAO.createStraight(straight);
     }
     public double [] findPointsOfIntersectionWithTheAxes (Straight straight) {
         return straightDAO.findPointsOfIntersectionWithTheAxes(straight);
     }
     public double [] findPointsOfIntersectionStraights (Straight straight, Straight straight1) {
         return straightDAO.findPointsOfIntersectionStraights(straight,straight1);
     }
     public Straight [] findAll () {
         return straightDAO.findAll();
     }
}
