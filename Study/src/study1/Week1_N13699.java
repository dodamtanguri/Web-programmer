package study1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Week1_N13699 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        long arr [] = new long[36];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < 36; i++) {
            for (int k = 0; k < i; k ++) {
                arr[i] += (arr[k] * arr[i-k-1]);
            }
        }
        System.out.println(arr[n]);
    }
}
