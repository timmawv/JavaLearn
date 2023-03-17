package avlyakulov.timur.algorithms;

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
    public int getNode () {
        return value;
    }

    // рекурсивный обход в глубину
    public int sum() {
        int sumNode = getNode();

        if (left != null)
            sumNode += left.sum();
        if (right != null)
            sumNode += right.sum();
        return sumNode;
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
        System.out.println("Сумма элементов нашего дерева " + tree.left.sum());
    }
}