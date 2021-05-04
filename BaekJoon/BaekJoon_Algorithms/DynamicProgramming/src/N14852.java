import java.util.Scanner;

public class N14852 {
    static long[][] dp = new long[1000001][2];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(result(num));
    }

    private static long result(int num) {
        dp[0][0] = 0;
        dp[1][0] = 2;
        dp[2][0] = 7;
        dp[2][1] = 1;
        for (int i = 3; i <= num; i++) {
            dp[i][1] = (dp[i - 1][1] + dp[i - 3][0]) % 1000000007;
            dp[i][0] = (3 * dp[i - 2][0] + 2 * dp[i - 1][0] + 2 * dp[i][1]) % 1000000007;
        }
        return dp[num][0];
    }
}
