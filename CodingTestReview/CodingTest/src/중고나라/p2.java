package 중고나라;

public class p2 {
    public long solution(long k) {
        long answer = 0;
        int cnt = 1;
        int cntSum = 0;

        while (true) {
            if (k <= cntSum + cnt) {
                answer = k - cntSum;

            } else {
                cntSum += cnt;
                cnt++;
            }
        }
    }
}
