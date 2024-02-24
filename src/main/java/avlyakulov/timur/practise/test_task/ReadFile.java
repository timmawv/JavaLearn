package avlyakulov.timur.practise.test_task;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadFile {

    public static void main(String[] args) {
        String filePath = "D:/Загрузки/file/10m.txt";
        File file = new File(filePath);
        long startTime = System.currentTimeMillis();
        new ReadFile().findValuesInFile(file);
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("The elapsed time is " + elapsedTime / 1000);
    }

    public void findValuesInFile(File file) {
        long maxNumber = Long.MIN_VALUE;
        long minNumber = Long.MAX_VALUE;
        List<Long> numbers = new ArrayList<>();
        BigDecimal sum = new BigDecimal("0");
        String line;
        long counter = 0;
        //Вибір був між Scanner та BufferedReader - обрав 2 так як воно має кращий performance

        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
            while ((line = fileReader.readLine()) != null) {
                ++counter;
                if (line.isBlank()) {
                    System.out.println("The line is blank");
                } else {
                    long number = Long.parseLong(line);
                    sum = sum.add(BigDecimal.valueOf(number));
                    numbers.add(number);
                    if (number > maxNumber) {
                        maxNumber = number;
                    }
                    if (number < minNumber) {
                        minNumber = number;
                    }
                }
            }
            System.out.println("The biggest number in the file: " + maxNumber);
            System.out.println("The smallest number in the file: " + minNumber);
            System.out.println("The arithmetic mean is " + sum.divide(BigDecimal.valueOf(counter), 16, RoundingMode.HALF_UP));
            System.out.println("The largest increasing sequence: " + findLongestIncreasingSequence(numbers));
            System.out.println("The largest decreasing sequence: " + findLongestDecreasingSequence(numbers));
            long median = calculateTheMedian(numbers);
            System.out.println("The median of the file: " + median);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private long calculateTheMedian(List<Long> numbers) {
        long median;
        Collections.sort(numbers);
        int size = numbers.size();
        if (size % 2 == 0) {
            System.out.println("The data set is even");
            long middle1 = numbers.get(size / 2 - 1);
            long middle2 = numbers.get(size / 2);
            median = (middle1 + middle2) / 2;
        } else {
            System.out.println("The data set is odd");
            median = numbers.get(size / 2);
        }
        return median;
    }

    public static List<Long> findLongestIncreasingSequence(List<Long> numbers) {
        List<Long> currentSequence = new ArrayList<>();
        List<Long> longestIncreasingSequence = new ArrayList<>();

        currentSequence.add(numbers.get(0));

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > numbers.get(i - 1)) {
                currentSequence.add(numbers.get(i));
            } else {
                if (currentSequence.size() > longestIncreasingSequence.size()) {
                    longestIncreasingSequence = new ArrayList<>(currentSequence);
                }
                currentSequence.clear();
                currentSequence.add(numbers.get(i));
            }
        }

        if (currentSequence.size() > longestIncreasingSequence.size()) {
            longestIncreasingSequence = new ArrayList<>(currentSequence);
        }

        return longestIncreasingSequence;
    }

    public static List<Long> findLongestDecreasingSequence(List<Long> numbers) {
        List<Long> currentSequence = new ArrayList<>();
        List<Long> longestDecreasingSequence = new ArrayList<>();

        currentSequence.add(numbers.get(0));

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < numbers.get(i - 1)) {
                currentSequence.add(numbers.get(i));
            } else {
                if (currentSequence.size() > longestDecreasingSequence.size()) {
                    longestDecreasingSequence = new ArrayList<>(currentSequence);
                }
                currentSequence.clear();
                currentSequence.add(numbers.get(i));
            }
        }
        if (currentSequence.size() > longestDecreasingSequence.size()) {
            longestDecreasingSequence = new ArrayList<>(currentSequence);
        }
        return longestDecreasingSequence;
    }
}