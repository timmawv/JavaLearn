package avlyakulov.timur.practise_tasks.copression_files.lab_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class AlgorithmHuffman {
    public static void main(String[] args) {
        String message = "The best city in the world";
        TreeMap<Character, Integer> frequency = countFrequency(message);
        System.out.println(frequency);

        List<CodeTreeNode> codeTreeNodes = new ArrayList<>();
        for (Character c : frequency.keySet()) {
            codeTreeNodes.add(new CodeTreeNode(c, frequency.get(c)));
        }

        CodeTreeNode tree = huffman(codeTreeNodes);

        TreeMap<Character, String> codes = new TreeMap<>();
        for (Character c : frequency.keySet()) {
            codes.put(c, tree.getCodeForCharacter(c, ""));
        }

        System.out.println(codes);
        StringBuilder encoded = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            encoded.append(codes.get(message.charAt(i)));
        }
        System.out.println(encoded);
        System.out.println(message.getBytes().length * 8 + " bit");
        System.out.println(encoded.length() + " bit");

        String decodedMessage = huffmanDecode(encoded.toString(), tree);
        System.out.println(decodedMessage);

        int originalBits = message.length() * 8; // каждый символ в UTF-16
        int encodedBits = encoded.length();

        double compressionRatio = (double) originalBits / encodedBits;
        System.out.println(compressionRatio);
    }

    private static CodeTreeNode huffman(List<CodeTreeNode> codeTreeNodes) {
        while (codeTreeNodes.size() > 1) {
            Collections.sort(codeTreeNodes);
            CodeTreeNode left = codeTreeNodes.remove(codeTreeNodes.size() - 1);
            CodeTreeNode right = codeTreeNodes.remove(codeTreeNodes.size() - 1);

            CodeTreeNode parent = new CodeTreeNode(null, right.weight + left.weight, left, right);
            codeTreeNodes.add(parent);
        }
        return codeTreeNodes.get(0);
    }

    private static String huffmanDecode(String encoded, CodeTreeNode tree) {
        StringBuilder decoded = new StringBuilder();

        CodeTreeNode node = tree;
        for (int i = 0; i < encoded.length(); i++) {
            node = encoded.charAt(i) == '0' ? node.left : node.right;
            if (node.content != null) {
                decoded.append(node.content);
                node = tree;
            }
        }
        return decoded.toString();
    }

    private static TreeMap<Character, Integer> countFrequency(String message) {
        TreeMap<Character, Integer> freqMap = new TreeMap<>();
        for (int i = 0; i < message.length(); ++i) {
            Character c = message.charAt(i);
            Integer count = freqMap.get(c);
            freqMap.put(c, count != null ? count + 1 : 1);
        }
        return freqMap;
    }

    private static class CodeTreeNode implements Comparable<CodeTreeNode> {
        Character content;
        int weight;
        CodeTreeNode left;
        CodeTreeNode right;

        public CodeTreeNode(Character content, int weight) {
            this.content = content;
            this.weight = weight;
        }

        public CodeTreeNode(Character content, int weight, CodeTreeNode left, CodeTreeNode right) {
            this.content = content;
            this.weight = weight;
            this.left = left;
            this.right = right;
        }

        @Override
        public int compareTo(CodeTreeNode o) {
            return o.weight - this.weight;
        }

        public String getCodeForCharacter(Character ch, String parentPath) {
            if (content == ch) {
                return parentPath;
            } else {
                if (left != null) {
                    String path = left.getCodeForCharacter(ch, parentPath + 0);
                    if (path != null) {
                        return path;
                    }
                }
                if (right != null) {
                    String path = right.getCodeForCharacter(ch, parentPath + 1);
                    if (path != null) {
                        return path;
                    }
                }
            }
            return null;
        }
    }
}