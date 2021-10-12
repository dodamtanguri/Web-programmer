package Trenbe;

import java.util.Arrays;
import java.util.Collections;

public class N1 {
    static int order(String[] strArr) {

        Arrays.sort(strArr);
        StringBuilder sb = new StringBuilder();
        for (String s : strArr) {
            sb.append(s);
        }
        return Integer.parseInt(sb.toString());
    }

    static int reverseOrder(String[] strArr) {
        Arrays.sort(strArr, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (String s : strArr) {
            sb.append(s);
        }
        return Integer.parseInt(sb.toString());
    }

    public int solution(int N) {
        int answer = -1;
        //int to String
        String str = Integer.toString(N);
        String[] strArr = str.split("");

        answer = order(strArr) + reverseOrder(strArr);


        return answer;
    }
}
