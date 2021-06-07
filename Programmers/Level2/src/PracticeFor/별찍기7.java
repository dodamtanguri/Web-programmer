package PracticeFor;

import java.util.Scanner;

public class 별찍기7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            for (int m = 0; m < 2 * i - 1; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            for (int m = 0; m < 2 * i - 1; m++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

