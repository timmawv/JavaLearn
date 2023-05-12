package avlyakulov.timur.practise.leetcode;

public class FinalValueAfterOperation {
    public int finalValueAfterOperations(String[] operations) {
        int counter = 0;
        for (String s : operations) {
            if (s.charAt(1) == '+')
                ++counter;
            else --counter;
        }
        return counter;
    }

    public static void main(String[] args) {
        String[] operations = {"++X", "X++","--X"};
        new FinalValueAfterOperation().finalValueAfterOperations(operations);
    }
}
