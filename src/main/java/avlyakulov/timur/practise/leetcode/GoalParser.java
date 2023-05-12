package avlyakulov.timur.practise.leetcode;

/*
Input: command = "G()(al)"
Output: "Goal"
Explanation: The Goal Parser interprets the command as follows:
G -> G
() -> o
(al) -> al
The final concatenated result is "Goal".

Input: command = "(al)G(al)()()G"
Output: "alGalooG"
 */
public class GoalParser {

    public String interpret(String command) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < command.length(); ++i) {
            if (command.charAt(i) == 'G') {
                builder.append('G');
            } else if (i != command.length() - 1 && command.charAt(i) == '(' && command.charAt(i + 1) == ')')
                builder.append('o');
            else if (i != command.length() - 1 && command.charAt(i) == '(' && command.charAt(i + 1) == 'a') {
                builder.append("al");
            }
        }
        return builder.toString();
    }
}
