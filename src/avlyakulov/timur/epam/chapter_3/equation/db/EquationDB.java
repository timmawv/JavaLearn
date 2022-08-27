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
        int disk = (int) Math.sqrt(Math.pow(quadraticEquation.getB(), 2) - 4 * quadraticEquation.getA() * quadraticEquation.getC());
        if (disk < 0)
            System.out.println("Решений нет та как дискриминант меньше нуля");
        else if (disk == 0) {
            System.out.println("Мы имеем только 1 решение та как дискриминант равен нулю");
            int x = -quadraticEquation.getB() / (2 * quadraticEquation.getA());
            System.out.println("Root: " + x);
        } else {
            x1 = (-quadraticEquation.getB() + disk) / (2 * quadraticEquation.getA());
            x2 = (-quadraticEquation.getB() - disk) / (2 * quadraticEquation.getA());
        }
        return new int[]{x1, x2};
    }

    public String findAscendingDescendingInterval(QuadraticEquation quadraticEquation) {
        int[] roots = findRoots(quadraticEquation);
        Arrays.sort(roots);
        return "Ascending: (-∞;" + roots[0] + ")  (" + roots[1] + ";+∞)" + " Descending: (" + roots[0] + ";" + roots[1] + ")";
    }
    public QuadraticEquation [] findAll () {
        return equations;
    }
}