package avlyakulov.timur.practise;


public class Practise {

    public int countGoodRectangles(int[][] rectangles) {
        int max = 0;
        int num;
        int counter = 0;
        for (int i = 0; i < rectangles.length; ++i) {
            num = rectangles[i][0] < rectangles[i][1] ? rectangles[i][0] : rectangles[i][1];
            if (max < num)
                max = num;
        }
        for (int i = 0; i < rectangles.length; ++i) {
            num = rectangles[i][0] < rectangles[i][1] ? rectangles[i][0] : rectangles[i][1];
            if (max == num)
                ++counter;
        }
        return counter;
    }

    public static void main(String[] args) {
        int[][] rectangles = {{5, 8}, {3, 9}, {5, 12}, {16, 5}};
        System.out.println(new Practise().countGoodRectangles(rectangles));
    }
}