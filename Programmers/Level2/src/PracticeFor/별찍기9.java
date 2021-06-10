package PracticeFor;

import java.util.Scanner;

public class 별찍기9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //역삼각형
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * n - 1) - (2 * i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //삼각형
        for (int i = 0; i < n - 1; i++) {
            for (int k = 1; k < (n - 1) - i; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 3 + (2 * i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

