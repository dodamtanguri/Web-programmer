package newCodingStudy.Week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N11048 {
    //미로의 크기
    static int n, m;
    static int[][] miro;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        miro = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int k = 1; k <= m; k++) {
                miro[i][k] = Integer.parseInt(st.nextToken());
                miro[i][k] += Math.max(miro[i][k - 1], Math.max(miro[i - 1][k], miro[i - 1][k - 1]));

            }
        }

        System.out.println(miro[n][m]);
    }
}
