package newCodingStudy.Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N9461 {
    static int t, n;
    static long[] dp;

    //long 타입 확인하기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        dp = new long[101];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        dp[5] = 2;

        for (int j = 6; j < dp.length; j++) {
            dp[j] = dp[j - 5] + dp[j - 1];
        }
        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            System.out.println(dp[n]);
        }

    }
}
