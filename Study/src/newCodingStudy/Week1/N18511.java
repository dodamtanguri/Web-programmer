package newCodingStudy.Week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class N18511 {

    public static int n, result, kCnt;
    public static int[] k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        kCnt = Integer.parseInt(st.nextToken());
        k = new int[kCnt];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < kCnt; i++) {
            k[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(k);
        dfs(0);
        System.out.println(result);


    }

    private static void dfs(int temp) {
        if (temp > n) return;
        if (result < temp) result = temp;
        for (int i = kCnt-1; i > -1; i--) {
            dfs(temp * 10 + k[i]);
        }
    }
}
