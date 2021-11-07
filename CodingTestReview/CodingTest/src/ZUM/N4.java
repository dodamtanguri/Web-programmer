package ZUM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N4 {
    static List<List<Node>> graph;

    public static void main(String[] args) {
        N4 test = new N4();
        int[][] data = {{1, 1, 1, 1}, {1, 1, 1, 1}};
        System.out.println(Arrays.toString(solution(data)));
    }

    public static int[] solution(int[][] grid) {

        graph = new ArrayList<>();
        for (int i = 0; i <= grid.length; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] info : grid) {
            graph.get(info[0]).add(new Node(info[1], 1));
            graph.get(info[1]).add(new Node(info[0], 1));
        }

        int[] answer = {};
        return answer;
    }

    static class Node {
        int node;
        int distance;

        Node(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }
    }
}
