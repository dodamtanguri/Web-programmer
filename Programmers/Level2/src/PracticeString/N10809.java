package PracticeString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class N10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < 26; i++) {
            char temp = (char) (97 + i);
            map.put(temp, -1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == -1) {
                if (map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), i);
                }
            }
        }

        for (int val : map.values()) {
            System.out.print(val + " ");
        }


    }


}
