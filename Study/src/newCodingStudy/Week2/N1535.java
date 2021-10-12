package newCodingStudy.Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1535 {
    //n 사람의 수
    //hp : 세준이의 체력
    //joy : 세준이의 기쁨
    static int n, hp, joy;
    // L 체력 , J 기쁨
    static int[] L, J;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        hp = 100;
        joy = 0;
        L = new int[n + 1];
        J = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < L.length; i++) {
            L[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < J.length; i++) {
            J[i] = Integer.parseInt(st.nextToken());
        }
        int[] dp = new int[100];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 99; j >= 0; j--) {
                int idx = L[i] + j;
                if (idx < 100) {
                    dp[idx] = Math.max(J[i] + dp[j], dp[idx]);
                }
            }
        }
        for (int i = 0; i < 100; i++) {
            if (joy < dp[i]) {
                joy = dp[i];
            }
        }
        System.out.println(joy);
    }
}
