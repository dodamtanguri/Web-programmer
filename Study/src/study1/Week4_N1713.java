package study1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Week4_N1713 {
    // n 사진틀의 개수
    // m 전체 학생의 총 추천 횟수
    public static int n, m;
    //추천받은 학생을 나타내는 번호 배열 >> 추천받은 순서대로
    public static int[] data;
    //비어있는 사진틀


    static class Recommand {

        private final int n;

        private final int like;
        private final int order;

        public Recommand(int n, int like, int order) {
           this.n = n;
           this.like = like;
           this.order = order;
        }

        public int getN() {
            return n;
        }

        public int getLike() {
            return like;
        }

        public int getOrder() {
            return order;
        }
    }

    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        n = Integer.parseInt(br.readLine());
//        m = Integer.parseInt(br.readLine());
        //사진 틀 배열
        // StringTokenizer st = new StringTokenizer(br.readLine());
        PriorityQueue<Recommand> queue = new PriorityQueue<Recommand>((a, b) -> {
            int tmp = a.getLike() - b.getLike();
            if (tmp == 0) {
                return a.getOrder() - b.getOrder();
            }
            return tmp;
        });

        int cnt = 0;
        queue.add(new Recommand(1, 1, cnt++));
        queue.add(new Recommand(2, 1, cnt++));
        queue.add(new Recommand(3, 3, cnt++));
        queue.add(new Recommand(4, 2, cnt++));

        System.out.println(queue);
    }
}
