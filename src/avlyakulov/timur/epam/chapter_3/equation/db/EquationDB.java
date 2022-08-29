package avlyakulov.timur.epam.chapter_3.equation.db;

import avlyakulov.timur.epam.chapter_3.equation.entity.QuadraticEquation;

import java.util.Arrays;

public class EquationDB {
    private static EquationDB instance;
    private QuadraticEquation[] equations;
    private int current;

    private EquationDB() {
        equations = new QuadraticEquation[10];
    }

    public static EquationDB getInstance() {
        if (instance == null)
            instance = new EquationDB();
        return instance;
    }

    public void creatEquation(QuadraticEquation quadraticEquation) {
        if (current == equations.length) {
            QuadraticEquation[] equations1 = new QuadraticEquation[equations.length + 1];
            System.arraycopy(equations, 0, equations1, 0, equations.length);
            equations = equations1;
        }
        equations[current] = quadraticEquation;
        current++;
    }

    public int[] findRoots(QuadraticEquation quadraticEquation) {
        int x1 = 0;
        int x2 = 0;
        int disk = (int) (Math.pow(quadraticEquation.getB(), 2) - 4 * quadraticEquation.getA() * quadraticEquation.getC());
        if (disk < 0)
            return null;
        else if (disk == 0) {
            int x = -quadraticEquation.getB() / (2 * quadraticEquation.getA());
            return new int[]{x};
        } else {
            x1 = (-quadraticEquation.getB() + (int) Math.sqrt(disk)) / (2 * quadraticEquation.getA());
            x2 = (-quadraticEquation.getB() - (int) Math.sqrt(disk)) / (2 * quadraticEquation.getA());
        }
        return new int[]{x1, x2};
    }

    public String findAscendingDescendingInterval(QuadraticEquation quadraticEquation) {
        int[] roots = findRoots(quadraticEquation);
        Arrays.sort(roots);
        if (quadraticEquation.getA() > 0)
            return "Ascending: (-∞;" + roots[0] + ")  (" + roots[1] + ";+∞)" + " Descending: [" + roots[0] + ";" + roots[1] + "]";
        else
            return "Ascending: [" + roots[0] + ";" + roots[1] + "] " + " Descending: (-∞;" + roots[0] + ") " + " (" + roots[1] + ";+∞)";
    }

    public QuadraticEquation[] findAll() {
        return equations;
    }

    public QuadraticEquation findMax(QuadraticEquation[] equations) {
        int max = 0;
        int[] roots;
        QuadraticEquation equation = new QuadraticEquation();
        for (QuadraticEquation quadraticEquation : equations)
            if (quadraticEquation != null) {
                roots = findRoots(quadraticEquation);
                if ((roots[0] + roots[1]) > max) {
                    max = roots[0] + roots[1];
                    equation = quadraticEquation;
                }
            }
        return equation;
    }

    public QuadraticEquation findMin(QuadraticEquation[] equations) {
        int min = 0;
        int[] roots;
        QuadraticEquation equation = new QuadraticEquation();
        for (QuadraticEquation quadraticEquation : equations)
            if (quadraticEquation != null) {
                roots = findRoots(quadraticEquation);
                if ((roots[0] + roots[1]) < min) {
                    min = roots[0] + roots[1];
                    equation = quadraticEquation;
                }
            }
        return equation;
    }
}