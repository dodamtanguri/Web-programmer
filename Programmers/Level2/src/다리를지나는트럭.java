import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {
    public static void main(String[] args) {
        다리를지나는트럭 test = new 다리를지나는트럭();
        System.out.println(test.solution(2, 10, new int[]{7, 4, 5, 6}));
        System.out.println(test.solution(100, 100, new int[]{10}));
        System.out.println(test.solution(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}));
    }

    public int solution(int bridge_length, int weight, int[] truck_weights) {

        //Enqueue : 큐 맨 뒤에서 데이터 추가
        //Dequeue : 큐 맨 앞쪽의 데이터 삭제
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < bridge_length; i++) {
            queue.add(0);
        }

        int idx = 0,
                sum = 0, //현재 트럭의 총 무게
                time = 0;

        while (!queue.isEmpty()) {
            int tmp = queue.remove();
            sum -= tmp;

            if (idx < truck_weights.length) {
                if (sum + truck_weights[idx] <= weight) {
                    queue.add(truck_weights[idx]);
                    sum += truck_weights[idx++];
                } else {
                    queue.add(0);
                }
            }
            time++;
        }

        return time;
    }
}
