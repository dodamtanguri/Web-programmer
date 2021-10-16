package newCodingStudy.Week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1058 {
    //시림의 수
    static final int MAX = 987654321;
    static int N;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            String str = br.readLine();
            for (int j = 1; j <= N; j++) {
                char ch = str.charAt(j - 1);
                if (i == j) continue;
                arr[i][j] = ch == 'Y' ? 1 : MAX;
            }
        }
        for (int i = 1; i <= N; i++) {
            for (int k = 1; k <= N; k++) {
                for (int n = 0; n < N; n++) {
                    if (k == n) continue;
                    arr[k][n] = Math.min(arr[k][n], arr[k][i] + arr[i][k]);
                }

            }
        }
        int max = 0;
        for (int i = 1; i <= N; i++) {
            int cnt = 0;
            for (int j = 1; j <= N; j++) {
                if (i == j) continue;
                if (arr[i][j] <= 2) cnt++;
            }
            if (max < cnt) max = cnt;
        }
        System.out.println(max);
    }
}
