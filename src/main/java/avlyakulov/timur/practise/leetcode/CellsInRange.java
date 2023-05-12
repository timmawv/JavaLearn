package avlyakulov.timur.practise.leetcode;

import java.util.ArrayList;
import java.util.List;


//Output: ["K1","K2","L1","L2"]
//Explanation:
//The above diagram shows the cells which should be present in the list.
//The red arrows denote the order in which the cells should be presented.
public class CellsInRange {
    public List<String> cellsInRange(String s) {
        List<String> cells = new ArrayList<>();
        int len = Character.getNumericValue(s.charAt(s.length() - 1));
        int num = Character.getNumericValue(s.charAt(1));
        char letter1 = s.charAt(0);
        char letter2 = s.charAt(3);
        String cell = "";
        boolean checkLetter = false;
        for (char i = 'A'; i <= 'Z'; i++) {
            if (i == letter1) {
                while (i != letter2 + 1) {
                    for (int j = num; j < len + 1; ++j) {
                        cell = "";
                        cell = cell.concat(String.valueOf(i) + j);
                        cells.add(cell);
                    }
                    ++i;
                }
            } else if (i == letter2) {
                break;
            }
        }
        return cells;
    }

    public static void main(String[] args) {
        String s = "U7:X9";
        new CellsInRange().cellsInRange(s);
    }
}