package newCodingStudy.Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N14916 {
    static int coin, cnt;


    //최소 동전의 개수

    // 5원 13 / 5 = 2 % 5 3
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        coin = Integer.parseInt(br.readLine());
        // inputdata 를 5 로 나눴을때 나머지가 2의 배수이면 2로 나눔
        while (coin > 0) {
            if (coin % 5 == 0) {
                cnt = coin / 5 + cnt;
                break;
            }

            coin -= 2;
            cnt++;
        }
        if (coin < 0) {
            System.out.println(-1);
        } else {
            System.out.println(cnt);
        }


    }
}
