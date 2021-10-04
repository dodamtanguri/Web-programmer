package Saramin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class SaraminTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        int num = input;
        HashSet<Integer> set = new HashSet<>();

        while (!set.contains(input)) {
            set.add(input);
            int temp = input;
            input = 0;
            while (temp != 0) {
                input += (temp % 10) * (temp % 10);
                temp /= 10;
            }
        }
        if (input == 1)
            System.out.println(num + " is a Happy number.");
        else
            System.out.println(num + " is an Unhappy number.");
    }

}
