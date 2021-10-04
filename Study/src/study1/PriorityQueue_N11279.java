package study1;

import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueue_N11279 {
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) ->
                b - a);
        for(int i = 0; i < n; i++) {
        }
    }

}
