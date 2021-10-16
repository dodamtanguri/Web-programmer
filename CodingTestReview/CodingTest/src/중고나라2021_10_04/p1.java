package 중고나라2021_10_04;

import java.util.Arrays;

public class p1 {
    static int[] result;

    public static void main(String[] args) {
        p1 test = new p1();
        int[] waiting = {1, 5, 8, 2, 10, 5, 4, 6, 4, 8};
        System.out.println(Arrays.toString(test.solution(waiting)));
    }

    public int[] solution(int[] waiting) {
        return result = Arrays.stream(waiting).distinct().toArray();
    }
}
