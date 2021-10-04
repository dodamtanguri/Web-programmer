package study1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Week3_N17521 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long w = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }


        //구매할 코인의 개수
        long coin = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                if (w >= arr[i]) {
                    //현재 돈 / 코인가격  = 구매한 코인의 개수
                    coin += w / arr[i];
                    //코인을 구매하고 남은 돈 저장
                    w %= arr[i];
                }
                //코인 가격이 떨어졌을 경우 >> 코인 구매
            } else if (arr[i] > arr[i + 1]) {
                w += coin * arr[i];
                coin = 0;

            }
        }

        w += coin * arr[n-1];
        System.out.println(w);

    }
}
