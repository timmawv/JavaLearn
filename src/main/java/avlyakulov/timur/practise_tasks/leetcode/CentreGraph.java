package avlyakulov.timur.practise_tasks.leetcode;

public class CentreGraph {
    public int findCenter(int[][] edges) {
        int counter = 1;
        int centre = edges[0][0];
        for (int i = 1; i < edges.length; ++i) {
            for (int x = 0; x < edges[0].length; ++x) {
                if (centre == edges[i][x])
                    ++counter;
            }
        }
        if (counter == edges.length)
            return centre;
        else
            return edges[0][1];
    }

    public static void main(String[] args) {
        int[][] edges = {{1, 2}, {2, 3}, {4, 2}};
        System.out.println(edges[0].length);
        System.out.println(new CentreGraph().findCenter(edges));
    }
}