package PracticeFor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class 숫자의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String temp = br.readLine();
        int[] tempArr = new int[temp.length()];
                //Stream.of(temp.split("")).mapToInt(Integer::parseInt).toArray();
        int answer = 0;
//        for (int i = 0; i < tempArr.length; i++) {
//            answer += tempArr[i];
//        }
        for (int i = 0; i < tempArr.length; i++) {
            tempArr[i] = temp.charAt(i) - '0';
            answer += tempArr[i];
        }
        System.out.println(answer);
    }
}
