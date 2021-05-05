import java.util.Scanner;

public class N10844 {
    //https://www.acmicpc.net/problem/10844
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //[N == 자릿수][마지막 숫자]
        int[][] dp = new int[101][11];
        //N == 1일 경우 >> 1~9 까지
        for (int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
        }
        for (int i = 2; i <= n; i++) {
            dp[i][0] = dp[i - 1][1];
            for (int j = 1; j <= 9; j++) {
                dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % 1000000000;
            }
        }

        System.out.println(dp[n]);
    }
}
