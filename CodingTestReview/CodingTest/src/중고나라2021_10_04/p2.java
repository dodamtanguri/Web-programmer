package 중고나라2021_10_04;

public class p2 {
    static long answer, cnt, cntSum;

    public static void main(String[] args) {
        p2 test = new p2();
        System.out.println(test.solution(10));
    }

    public long solution(long k) {
        answer = 0;
        cnt = 1;
        cntSum = 0;
        while (true) {
            if (k <= cntSum + cnt) {
                answer = k - cntSum;
                break;
            } else {
                cntSum += cnt;
                cnt++;
            }
        }

        return answer;
    }
}
