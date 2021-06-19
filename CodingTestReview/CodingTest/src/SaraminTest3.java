import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class SaraminTest3 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N, a, b;
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        System.out.print(median(N, a, b));

    }

    public static Long median(int N, int a, int b) {

        PriorityQueue<Long> maxHeap = new PriorityQueue<>((o1, o2) -> Long.compare(o2, o1));

        PriorityQueue<Long> minHeap = new PriorityQueue<>((o1, o2) -> Long.compare(o2, o1));

        long seed = 1983;
        long result = 0;
        for (int i = 0; i < N; i++) {
            if (maxHeap.size() == minHeap.size())
                maxHeap.offer(seed);
            else
                minHeap.offer(seed);

            if (!minHeap.isEmpty() && !maxHeap.isEmpty() && minHeap.element() < maxHeap.element()) {
                Long maxElement = maxHeap.poll();
                Long minElement = minHeap.poll();

                maxHeap.offer(minElement);
                minHeap.offer(maxElement);
            }
            seed = (seed * (long) a + b) % 20090711;
            result = (result + maxHeap.element()) % 20090711;
        }
        return result;
    }
}

