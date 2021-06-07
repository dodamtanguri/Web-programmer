package PracticeFor;

import java.util.Scanner;

public class 별찍기6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n-1; i >= 0; i--) {
            //빈칸
            for (int k = 1; k < n - i; k++) {
                System.out.print(" ");
            }
            for (int m = 0; m < (i * 2 + 1); m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
