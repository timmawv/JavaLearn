package avlyakulov.timur.algorithms;

import avlyakulov.timur.collections.queue.SimpleQueue;
import avlyakulov.timur.collections.stack.SimpleStack;

public class Tree {
    int value;
    Tree left;
    Tree right;

    //конструктор для дерева, когда нам нужно создать на основе узла и 2 корней
    public Tree(int value, Tree left, Tree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    //конструктор для класса когда нужно создать на основе 1 значения
    //и у нас нет вообще узлов
    public Tree(int value) {
        this.value = value;
    }

    //нашем дереве получаем значение корня
    public int getNode() {
        return value;
    }

    //рекурсивный обход в глубину
    public int sum() {
        int sumNode = getNode();
        if (left != null)
            sumNode += left.sum();
        if (right != null)
            sumNode += right.sum();
        return sumNode;
    }

    //итеративный обход дерева в глубину
    public int sumIterable(Tree root) {
        SimpleStack<Tree> stack = new SimpleStack<>();
        stack.push(root);
        int sumNode = 0;
        while (!stack.isEmpty()) {
            Tree node = stack.pop();
            sumNode += node.getNode();
            if (node.left != null)
                stack.push(node.left);
            if (node.right != null)
                stack.push(node.right);
        }
        return sumNode;
    }

    //итеративный обход дерева в ширину с применением Queue
    public int sumWide(Tree root) {
        SimpleQueue<Tree> queue = new SimpleQueue<>();
        queue.add(root);
        int sumNode = 0;
        while (!queue.isEmpty()) {
            Tree node = queue.remove();
            sumNode += node.getNode();
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }
        return sumNode;
    }

    //поиск эелемента в дереве
    public Tree findElementInTree(int value) {
        Tree root = this;
        while (root.getNode() != value) {
            if (value > root.getNode())
                root = root.right;
            else root = root.left;
        }
        return root;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", leftChild=" + left +
                ", rightChild=" + right +
                "}";
    }


    public static void main(String[] args) {
        Tree tree = new Tree(20,
                new Tree(7,
                        new Tree(4,
                                null, new Tree(6)),
                        new Tree(9)),
                new Tree(35,
                        new Tree(31,
                                new Tree(28), null),
                        new Tree(40,
                                new Tree(38),
                                new Tree(52))));
        System.out.println("Сумма элементов нашего дерева рекурсивным обходом в глубину  " + tree.left.sum());
        System.out.println("Сумма элементов нашего дерева итеративным обходом в глубину  " + tree.sumIterable(tree));
        System.out.println("Сумма элементов нашего дерева итеративным обходом в ширину  " + tree.sumWide(tree));

        Tree findTree = tree.findElementInTree(31);
        System.out.println("Find Tree " + findTree);
    }

}