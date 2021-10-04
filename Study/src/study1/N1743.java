package study1;

import com.sun.xml.internal.xsom.XSSimpleType;

import java.io.*;
import java.util.StringTokenizer;

public class N1743 {
    public static int n, m;
    public static int[][] map;
    public static boolean[][] visit;
    public static int result;
    public static int dy[] = {1, 0, -1, 0};
    public static int dx[] = {0, 1, 0, -1};
    public static void n1743() {
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                if (map[i][j] ==1 && !visit[i][j]) {
                    int temp = result;
                    result = 0;
                    dfs(i,j);
                    result = Math.max(result,temp);
                }
            }
        }
    }
    public static void dfs(int r, int c) {
        visit[r][c] = true;
        result++;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        map = new int[n + 1][m + 1];
        visit = new boolean[n + 1][m + 1];

        for (int i = 1; i < k+1; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            map[r][c] = 1;
        }

    }
}
