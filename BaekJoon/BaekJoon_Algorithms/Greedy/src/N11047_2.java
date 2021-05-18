import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class N11047_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //10개의 종류가 다른 동전
        int k = Integer.parseInt(st.nextToken()); // 동전의 합
        int[] coin = new int[n];
        for (int i = 0; i < n; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(coin);
        int result = 0;
        for (int i = n-1; i >= 0; i--) {
            if (coin[i] <= k) {
                result += k / coin[i];
                k %= coin[i];
            }

        }
        System.out.println(result);
    }
}
