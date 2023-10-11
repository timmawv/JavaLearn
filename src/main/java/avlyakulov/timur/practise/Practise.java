package avlyakulov.timur.practise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

public class Practise {

    /*public boolean areOccurrencesEqual(String s) {
        boolean checkGoodString = true;
        char[] arr = s.toCharArray();
        int mainCounter = 0;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[0] == arr[i]) {
                ++mainCounter;
            }
        }
        for (int i = 0; i < arr.length; ++i) {
            int counter = 0;
            for (int j = 0; j < arr.length;++j) {
                if (i!=j && arr[i] != arr[0]) {
                    if (arr[i] == arr[j])
                        ++counter;
                }
            }
            if (counter != mainCounter) {
                checkGoodString = false;
                break;
            }

        }
        return checkGoodString;
    }*/
    public boolean areOccurrencesEqual(String s) {
        boolean checkGoodString = true;
        Set<Character> set = new TreeSet<>();
        char[] arr = s.toCharArray();
        for (char c : arr)
            set.add(c);
        int[] hitLetters = new int[set.size()];
        int posArr = 0;
        for (char c : set) {
            int counter = 0;
            for (int i = 0; i < arr.length; ++i) {
                if (c == arr[i])
                    ++counter;
            }
            hitLetters[posArr] = counter;
            ++posArr;
        }
        for (int i = 0; i < hitLetters.length; ++i) {
            for (int j = i + 1; j < hitLetters.length; ++j) {
                if (hitLetters[i] != hitLetters[j]) {
                    checkGoodString = false;
                    break;
                }
            }
        }

        return checkGoodString;
    }

    public static void main(String[] args) {
        String s = " ";
        System.out.println(s.isBlank());
        System.out.println(s.isEmpty());
    }
}