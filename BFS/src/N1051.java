import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class N1051 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken()); // 행
        int m = Integer.parseInt(st.nextToken()); // 열

        int[][] arr = new int[n][m]; // 입력받을 배열 초기화

        //꼭지점에 쓰여있는 수가 모두 같은 가장 큰 정사각형
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = input.charAt(j) - '0';
            }
        }

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j<=m; j++) {

            }
        }

    }
}
