import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class 더맵게 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int j : scoville) {
            queue.offer(j);
        }
        // queue.peek() >> priorityQueue에 첫번째 값 참조 = 1
        while (queue.peek() < K) {
            if (queue.size() == 1) return -1;
            int a = queue.poll();
            int b = queue.poll();

            int result = a + ( b * 2);
            queue.offer(result);
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        더맵게 test = new 더맵게();
        int [] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;
        System.out.println(test.solution(scoville,k));
    }
}


