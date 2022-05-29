package avlyakulov.timur.task1;

public class Main {
    public static void main(String[] args) {
        FloorSumNeighboring sum = new FloorSumNeighboring();
        int[] arr = sum.sumNeighboring();
        for (int i : arr)
            System.out.println("Elements:" + i);
        System.out.println();
    }

}
