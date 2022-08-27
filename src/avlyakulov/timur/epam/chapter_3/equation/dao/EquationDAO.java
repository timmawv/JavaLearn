package avlyakulov.timur.epam.chapter_3.equation.dao;

import avlyakulov.timur.epam.chapter_3.equation.db.EquationDB;
import avlyakulov.timur.epam.chapter_3.equation.entity.QuadraticEquation;

public class EquationDAO {
    public void creatEquation (QuadraticEquation quadraticEquation) {
        EquationDB.getInstance().creatEquation(quadraticEquation);
    }
    public int[] findRoots (QuadraticEquation quadraticEquation) {
        return EquationDB.getInstance().findRoots(quadraticEquation);
    }
    public String findAscendingDescendingInterval (QuadraticEquation quadraticEquation) {
        return EquationDB.getInstance().findAscendingDescendingInterval(quadraticEquation);
    }
    public QuadraticEquation [] findAll () {
        return EquationDB.getInstance().findAll();
    }
}