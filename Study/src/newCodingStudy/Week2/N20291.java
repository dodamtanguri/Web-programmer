package newCodingStudy.Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class N20291 {
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            //파일 이름과 확장자
            String str = br.readLine();
            String extension = str.substring(str.indexOf('.') + 1);
            if (!map.containsKey(extension)) {
                map.put(extension, 1);
            } else {
                map.replace(extension, map.get(extension) + 1);
            }
        }
        for (String temp : map.keySet()) {
            System.out.println(temp + " " + map.get(temp));
        }
    }
}
