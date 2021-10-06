package newCodingStudy.Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N11504 {
    /*
    T 테스트 케이스의 개수
    N 돌림판 N등분
    M X,Y의 길이
    X의 각자리수 String 으로 받아서 붙히고 Int 형태로 붙혀주쟈
    Y의 각자리수
     */

    static int T, N, M;
    static int X;
    static int Y;
    static String[] wheel;
    static StringBuffer sb;
    static StringTokenizer st;

    static StringBuffer makeNumber(StringTokenizer st) {
        sb = new StringBuffer();
        for (int j = 0; j < M; j++) {
            if (st.hasMoreTokens()) {
                sb.append(st.nextToken());
            } else break;
        }
        return sb;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            //돌림판 몇등분
            N = Integer.parseInt(st.nextToken());
            //X와 Y의 길이
            M = Integer.parseInt(st.nextToken());
            //X와 Y를 String buffer로 append해주고 이걸 Integer로 바꿈
            st = new StringTokenizer(br.readLine());
            X = Integer.parseInt(makeNumber(st).toString());
            st = new StringTokenizer(br.readLine());
            Y = Integer.parseInt(makeNumber(st).toString());

            //돌림판
            wheel = new String[N];
            st = new StringTokenizer(br.readLine(), " ");
            for (int idx = 0; idx < N; idx++) {
                wheel[idx] = st.nextToken();
            }
            int count = 0;
            for (int k = 0; k < N; k++) {
                sb = new StringBuffer();
                int temp = 0;
                for (int j = 0; j < M; j++) {
                    sb.append(wheel[(k + j) % N]);
                }
                temp = Integer.parseInt(sb.toString());
                if (X <= temp && temp <= Y) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
