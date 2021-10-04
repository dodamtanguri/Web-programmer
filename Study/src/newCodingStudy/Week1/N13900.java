package newCodingStudy.Week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N13900 {
    public static int n;
    public static int[] num;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        num = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        long sum = 0;
        long temp = 0;

        for (int i = 1; i < num.length; i++) {
            temp += num[i];
        }

        for (int i = 0; i < num.length; i++) {
            sum += num[i] * temp;

            if (i + 1 < num.length)
                temp = temp - num[i + 1];
        }

        System.out.println(sum);
    }
}
