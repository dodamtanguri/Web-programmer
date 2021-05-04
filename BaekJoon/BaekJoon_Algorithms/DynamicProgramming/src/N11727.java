import java.util.Scanner;

public class N11727 {
    static int dp[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        dp = new int[1001];
        dp[0] = 1;
        dp[1] = 1;
        System.out.println(dp(num));
    }
    static public int dp(int num){
        if (dp[num] != 0 ) {
            return dp[num];
        } else {
            dp[num] = (dp(num-1) + 2*dp(num-2)) % 10007;
            return dp[num];
        }
    }
}
