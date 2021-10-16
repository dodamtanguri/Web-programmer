package newCodingStudy.Week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N16234 {
    static int N, L, R;
    // N X N 크기의 땅
    //각 땅의 나라가 하나씩 존재
    static int[][] land;
    static boolean[][] visited;

    //국경선을 공유하면서 인구 차이를 만족하는 나라를 찾음
//    public static int dfs(int x, int y) {
//
//    }

    public static int moving() {
        int result = 0;
        while (true) {
            boolean move = false;
            visited = new boolean[N][N];
            for (int i = 0; i < N; i++) {
                for (int k = 0; k < N; k++) {
                    if (visited[i][k]) continue;

                }
            }
            if (move) result++;
            else return result;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        //인구 차이 L 명 이상 R명 이하 두나라가 공유하는 국경선을 하루동안 염
        L = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        land = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int k = 0; k < N; k++) {
                land[i][k] = Integer.parseInt(st.nextToken());
            }
        }
    }
}
