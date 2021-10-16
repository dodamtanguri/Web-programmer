package newCodingStudy.Week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N1026 {
    //A 배열에서 가장 작은 수 X B 배열에서 가장 큰 수 곱해야함
    static int n;
    static int[] a, k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        a = new int[n];
        k = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            k[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(k);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (a[i] * k[n - i - 1]);
        }
        System.out.println(sum);
    }
}
