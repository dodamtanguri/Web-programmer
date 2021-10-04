package newCodingStudy.Week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N14620 {
    private static final int[] dx = {-1, 0, 1, 0};
    private static final int[] dy = {0, 1, 0, -1};
    public static int n;
    public static int[][] price;
    public static boolean[][] visit;
    public static int result = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        price = new int[n + 1][n + 1];
        visit = new boolean[n + 1][n + 1];

        StringTokenizer st;
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                price[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(0, 0);
        System.out.println(result);

    }

    private static void dfs(int flower, int sum) {
        if (flower == 3) {
            result = Math.min(result, sum);
        } else {
            for (int i = 2; i < n; i++) {
                for (int j = 2; j < n; j++) {
                    if (!visit[i][j] && check(i, j)) {
                        visit[i][j] = true;
                        int hap = sum(i, j);
                        dfs(flower + 1, sum + hap);
                        visitClear(i, j);
                        visit[i][j] = false;
                    }
                }
            }
        }
    }

    private static int sum(int x, int y) {
        int hap = price[x][y];
        for (int i = 0; i < dx.length; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            visit[nx][ny] = true;
            hap += price[nx][ny];
        }
        return hap;

    }

    private static boolean check(int x, int y) {
        for (int i = 0; i < dx.length; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (visit[nx][ny]) {
                return false;
            }
        }
        return true;
    }//check

    private static void visitClear(int x, int y) {
        for (int i = 0; i < dx.length; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            visit[nx][ny] = false;
        }

    }
}
