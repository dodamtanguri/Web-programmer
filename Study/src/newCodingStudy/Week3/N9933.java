package newCodingStudy.Week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class N9933 {
    static int n;
    static ArrayList<String> str;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        str = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String temp = br.readLine();
            String sb = new StringBuffer(temp).reverse().toString();

            if (str.contains(sb) || temp.equals(sb)) {
                System.out.println(temp.length() + " " + temp.charAt(sb.length() / 2));
            } else {
                str.add(temp);
            }
        }

    }

}
