package avlyakulov.timur.practise_tasks.copression_files.lab_1;

import java.util.HashMap;
import java.util.Map;

public class ArithmeticCompression {
    public static void main(String[] args) {
        String input = "the best city in the world";
        Map<Character, Double> probabilities = calculateProbabilities(input);

        double lowerBound = 0.0;
        double upperBound = 1.0;
        double range = 1.0;

        for (char c : input.toCharArray()) {
            double charProbability = probabilities.get(c);
            double newLowerBound = lowerBound + range * charProbability;
            double newUpperBound = lowerBound + range * (charProbability + probabilities.get(c));

            lowerBound = newLowerBound;
            upperBound = newUpperBound;
            range = upperBound - lowerBound;
        }

        // Output the compressed value (average of lower and upper bounds)
        double compressedValue = (lowerBound + upperBound) / 2;
        System.out.println("Compressed value: " + compressedValue);
        String decompress = decompress(compressedValue, input);
        System.out.println(decompress);
        double inputLength = input.getBytes().length * 8;
        System.out.println("Коефіцієнт стискання " + (inputLength / 64));
    }

    private static Map<Character, Double> calculateProbabilities(String input) {
        Map<Character, Integer> charCounts = new HashMap<>();
        int totalChars = 0;

        for (char c : input.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
            totalChars++;
        }

        Map<Character, Double> probabilities = new HashMap<>();
        for (char c : charCounts.keySet()) {
            double probability = (double) charCounts.get(c) / totalChars;
            probabilities.put(c, probability);
        }

        return probabilities;
    }

    public static String decompress(double compressedValue, String input) {
        Map<Character, Double> probabilities = calculateProbabilities(input);

        StringBuilder decodedString = new StringBuilder();
        double lowerBound = 0.0;
        double upperBound = 1.0;
        double range = 1.0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            double charProbability = probabilities.get(c);
            double newLowerBound = lowerBound + range * charProbability;
            double newUpperBound = lowerBound + range * (charProbability + probabilities.get(c));

            if (compressedValue >= newLowerBound && compressedValue < newUpperBound) {
                decodedString.append(c);
                lowerBound = newLowerBound;
                upperBound = newUpperBound;
                range = upperBound - lowerBound;
            }
        }
        return decodedString.toString();
    }
}