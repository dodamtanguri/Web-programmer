package study1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Week2_N3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //조건 만족하는 쌍의 개수 카운트 해줄 변수
        int count = 0;
        //수열의 크기 n
        int n = Integer.parseInt(br.readLine());
        //수열을 저장해줄 배열
        int[] arr = new int[n];
        //반복문으로 수열의 데이터를 배열에 하나씩 저장해줌
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        //쌍의 합
        int x = Integer.parseInt(br.readLine());
        int temp = 0;

        int start = 0;
        int end = n - 1;

        while (start < end) {
            temp = arr[start] + arr[end];
            if (temp == x) {
                count++;
                start++;
                end--;
            } else if (temp > x) end--;
            else start++;
        }

        System.out.println(count);
    }
}

