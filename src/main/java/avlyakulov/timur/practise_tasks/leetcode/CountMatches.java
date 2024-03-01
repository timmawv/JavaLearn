package avlyakulov.timur.practise_tasks.leetcode;

import java.util.List;

public class CountMatches {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int typeNum = 0;
        int counter = 0;
        switch (ruleKey) {
            case "color" -> typeNum = 1;
            case "name" -> typeNum = 2;
        }
        for (List<String> l : items) {
            if (l.get(typeNum).equals(ruleValue))
                ++counter;
        }
        return counter;
    }

}
