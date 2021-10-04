package study1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Week3_N16507 {
    //r >> 세로 c >> 가로 q >> 사진 일부분의 밝기 평균을 알아보는 개수를 의미하는 정수
    static int r, c, q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //+1은 문제에서 꼭지점의 시작을 1부터 했기때문에 인덱스 방을 하나씩 더 만들어줌.
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        q = Integer.parseInt(st.nextToken());
        int[][] arr = new int[r + 1][c + 1];
        //이중 for문을 통해서 입력받은 픽셀의 밝기를 입력하면서 누적합을 입력해준다.
        for (int i = 1; i < r + 1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int k = 1; k < c + 1; k++) {
                arr[i][k] = arr[i][k - 1] + arr[i - 1][k] + Integer.parseInt(st.nextToken()) - arr[i - 1][k - 1];

            }
        }
        //이미 입력받을때 누적합을 입력받았기때문에 부분합구하는 알고리즘을 통해서 답을 구한다.
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int r1 = Integer.parseInt(st.nextToken());
            int c1 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            int c2 = Integer.parseInt(st.nextToken());
            //누적합 (picture 함수라고함_
            int result = arr[r2][c2] - (arr[r1 - 1][c2] + arr[r2][c1 - 1] - arr[r1 - 1][c1 - 1]);

            result /= ((r2 - r1 + 1) * (c2 - c1 + 1));
            System.out.println(result);
        }
    }
}
