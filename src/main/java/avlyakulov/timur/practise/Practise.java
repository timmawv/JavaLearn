package avlyakulov.timur.practise;


import java.util.ArrayList;
import java.util.List;

public class Practise {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; ++i) {
            int length = String.valueOf(i).length();
            int counter = 0;
            int temp = i;
            for (int j = 0; j < length; ++j) {
                int n = temp % 10;
                if (n == 0)
                    break;
                if (i % n == 0)
                    ++counter;
                temp /= 10;
            }
            if (counter == length)
                list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(new Practise().selfDividingNumbers(688, 690));
    }
}