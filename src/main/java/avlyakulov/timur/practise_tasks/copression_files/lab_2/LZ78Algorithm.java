package avlyakulov.timur.practise_tasks.copression_files.lab_2;

import java.util.ArrayList;

public class LZ78Algorithm {
    public static void main(String[] args) {
        String input = "ababababcababababc";
        ArrayList<LZ77Token> compressed = compress(input);
        System.out.println("Compressed: " + compressed);
        String decompressed = decompress(compressed);
        System.out.println("Decompressed: " + decompressed);
    }

    static ArrayList<LZ77Token> compress(String input) {
        ArrayList<LZ77Token> compressed = new ArrayList<>();
        int currentIndex = 0;
        while (currentIndex < input.length()) {
            int bestMatchLength = 0;
            int bestMatchOffset = 0;
            for (int searchOffset = 1; searchOffset <= currentIndex; searchOffset++) {
                int matchLength = 0;
                while (currentIndex + matchLength < input.length() &&
                        input.charAt(currentIndex + matchLength) == input.charAt(currentIndex - searchOffset + matchLength)) {
                    matchLength++;
                }
                if (matchLength > bestMatchLength) {
                    bestMatchLength = matchLength;
                    bestMatchOffset = searchOffset;
                }
            }
            if (bestMatchLength > 0) {
                compressed.add(new LZ77Token(bestMatchOffset, bestMatchLength, input.charAt(currentIndex + bestMatchLength)));
                currentIndex += bestMatchLength;
            } else {
                compressed.add(new LZ77Token(0, 0, input.charAt(currentIndex)));
                currentIndex++;
            }
        }
        return compressed;
    }

    static String decompress(ArrayList<LZ77Token> compressed) {
        StringBuilder decompressed = new StringBuilder();
        for (LZ77Token token : compressed) {
            if (token.getOffset() == 0) {
                decompressed.append(token.getLiteral());
            } else {
                int startIndex = decompressed.length() - token.getOffset();
                int endIndex = startIndex + token.getLength();
                for (int i = startIndex; i < endIndex; i++) {
                    decompressed.append(decompressed.charAt(i));
                }
                decompressed.append(token.getLiteral());
            }
        }
        return decompressed.toString();
    }
}

class LZ77Token {
    private int offset;
    private int length;
    private char literal;

    public LZ77Token(int offset, int length, char literal) {
        this.offset = offset;
        this.length = length;
        this.literal = literal;
    }

    public int getOffset() {
        return offset;
    }

    public int getLength() {
        return length;
    }

    public char getLiteral() {
        return literal;
    }

    @Override
    public String toString() {
        return "(" + offset + ", " + length + ", " + literal + ")";
    }
}
