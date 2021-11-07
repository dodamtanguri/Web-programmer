package newCodingStudy.Week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N13565 {
    //전류통하는거 0 안통하는거 1
    static int m, n;
    static int[][] map;
    static int[] dr = {-1, 0, 1, 0};
    static int[] dc = {0, -1, 0, 1};
    static boolean flag = false;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[m][n];
        visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                map[i][k] = line.charAt(k) - '0';
            }
        }
        for (int i = 0; i < n; i++) {
            if (map[0][i] == 0) {
                check(0, i);
            }
        }
        System.out.println(flag ? "YES" : "NO");
    }

    private static void check(int r, int c) {
        visited[r][c] = true;
        if (r == m - 1) {
            flag = true;
            return;
        }
        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];
            if (OOB(nr, nc)) continue;
            if (visited[nr][nc]) continue;
            if (map[nr][nc] == 1) continue;
            check(nr, nc);

        }
    }

    private static boolean OOB(int r, int c) {
        return r < 0 || c < 0 || r >= m || c >= n;
    }
}
