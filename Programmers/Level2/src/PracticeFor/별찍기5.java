package PracticeFor;

import java.util.Scanner;

public class 별찍기5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            //왼쪽(중심선 포함)
            for (int l = 1; l <= n - i; l++) {
                System.out.print(" ");
            }
            for (int r = 1; r <= 2 * i - 1; r++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
