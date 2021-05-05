import java.util.Scanner;

public class N2133 {
    static int[] dp = new int[31];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(result(num));
    }

    public static int result(int num) {
        if (num == 0) return 1;
        if (num == 1) return 0;
        if (num == 2) return 3;
        if (dp[num] != 0) return dp[num];
        int temp = 3 * result(num - 2);
        for (int i = 3; i <= num; i++) {
            if (i % 2 == 0) {
                temp += 2 * result(num - i);
            }
        }
        return dp[num] = temp;
    }
}

