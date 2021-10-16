package newCodingStudy.Week3;

import java.util.Scanner;

public class N1904 {
    static int n;
    static int[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dp = new int[1000001];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < dp.length; i++) {
            dp[i] = -1;
        }
        System.out.println(Tile(n));
    }

    private static int Tile(int n) {
        if (dp[n] == -1) {
            dp[n] = (Tile(n - 1) + Tile(n - 2)) % 15746;
        }
        return dp[n];
    }
}
