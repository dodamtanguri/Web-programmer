import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Week2_N15486 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        //퇴사일
        int n = Integer.parseInt(br.readLine());
        //최대수익
        int result = Integer.MIN_VALUE;
        //최대 금액을 저장하는 배열
        // 인덱스가 0이 아니라 1부터 시작하기 때문에  +1
        // 퇴사하는 날짜의 N+1 (마지막날도 포함시키기 떄문에) +1
        int[] dp = new int[n+2];
        //두번째줄부터 주어지는 시간을 입력하기 위한 배열
        int[] time = new int[n+2];
        // 수익을 입력하는 배열
        int[] profit = new int[n+2];

        for(int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            time[i] = Integer.parseInt(st.nextToken());
            profit[i] = Integer.parseInt(st.nextToken());
        }
        //반복문에서 n+1까지 돌려주는 이유 >> 퇴사당일날까지의 수익을 포함시키기 위해서
        for (int i  = 1; i <= n+1; i++) {
            result = Math.max(result,dp[i]);

            if (i+time[i] <= n+1) {
                dp[i+time[i]] = Math.max(result+profit[i],dp[i+time[i]]);
            }
        }
        System.out.println(result);
    }
}
