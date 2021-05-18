import java.util.Arrays;
import java.util.Comparator;

public class 실패율 {
    public static void main(String[] args) {
        실패율 test = new 실패율();
        test.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3});
    }

    public int[] solution(int N, int[] stages) {
        Pair[] answer = new Pair[N];
        int[] success = new int[N];
        int[] fail = new int[N];

        for (int stage : stages) {//사람수 만큼 반복하는 거
            for (int j = 0; j < N; j++) { //스테이지 수 만큼 반복하는 거
                if (stage == j + 1) {
                    fail[j]++;
                }
                if (stage >= j + 1) {
                    success[j]++;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            answer[i] = new Pair(i, fail[i] / (double) success[i]);
        }

        Arrays.sort(answer, Comparator.comparingDouble(a -> a.val));

        int[] res = new int[N];

        for (int i = 0; i < answer.length; i++) {
            res[i] = answer[i].idx;
        }

        return res;
    }

    static class Pair {
        int idx;
        double val;

        Pair(int idx, double val) {
            this.idx = idx;
            this.val = val;
        }
    }
}
