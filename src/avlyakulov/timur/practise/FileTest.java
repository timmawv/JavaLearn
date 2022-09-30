package avlyakulov.timur.practise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FileTest {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "D:\\Загрузки\\testFile.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        scanner.close();
        System.out.println(line);
        String[] numbersString = line.split(" ");
        System.out.println(Arrays.toString(numbersString));
        int [] numbers = new int[numbersString.length];
        int counter = 0;
        for (String num : numbersString) {
            numbers[counter] = Integer.parseInt(num);
            ++counter;
        }
        for (int i : numbers)
            System.out.println(i);
        System.out.println(Arrays.toString(numbers));
    }
}
