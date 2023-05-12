package avlyakulov.timur.epam.chapter_3.equation.service;

import avlyakulov.timur.epam.chapter_3.equation.dao.EquationDAO;
import avlyakulov.timur.epam.chapter_3.equation.entity.QuadraticEquation;

public class EquationService {
    private final EquationDAO equationDAO = new EquationDAO();

    public void createEquation(QuadraticEquation quadraticEquation) {
        equationDAO.creatEquation(quadraticEquation);
    }

    public int[] findRoots(QuadraticEquation quadraticEquation) {
        return equationDAO.findRoots(quadraticEquation);
    }

    public String findAscendingDescendingInterval(QuadraticEquation quadraticEquation) {
        return equationDAO.findAscendingDescendingInterval(quadraticEquation);
    }

    public QuadraticEquation[] findAll() {
        return equationDAO.findAll();
    }

    public QuadraticEquation findMax(QuadraticEquation[] equations) {
        return equationDAO.findMax(equations);
    }

    public QuadraticEquation findMin(QuadraticEquation[] equations) {
        return equationDAO.findMin(equations);
    }

}