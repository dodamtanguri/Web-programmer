package study1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Week3_13305 {
    static int n;
    static int[] distance;
    static int[] oilPrice;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //도시 개수
        n = Integer.parseInt(br.readLine());
        //도시간의 도로 거리
        distance = new int[n - 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < distance.length; i++) {
            distance[i] = Integer.parseInt(st.nextToken());
        }
        //각 도시의 리터당 기름 가격
        oilPrice = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < oilPrice.length; i++) {
            oilPrice[i] = Integer.parseInt(st.nextToken());
        }
        long sum = 0;
        long minCost = oilPrice[0];

        for (int i = 0; i < distance.length; i++) {
            if (oilPrice[i] < minCost) {
                minCost = oilPrice[i];
            }
            sum += (minCost * distance[i]);
        }
        System.out.println(sum);
    }

}
