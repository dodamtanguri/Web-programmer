package newCodingStudy.Week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1094 {
    static int x;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        x = Integer.parseInt(br.readLine());
        int stick = 64;
        int cnt = 0;
        while (x > 0) {
            if (stick > x) {
                stick /= 2;
            } else {
                cnt++;
                x -= stick;
            }
        }
        System.out.println(cnt);
    }
}
