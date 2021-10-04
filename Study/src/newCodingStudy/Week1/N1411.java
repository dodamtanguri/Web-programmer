package newCodingStudy.Week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1411 {
    public static int n;
    public static String[] word;

    //같은 알파벳으로 이루어져있고, 단어의 길이가 같은게 총 몇개인지 세기
    // 우선 길이를 확인하고 길이가 틀리면 무조건 false
    //순서쌍 뽑아내는 공식 활용해서 count 해주기 >> 안해도 될거같음.
    //알파벳이 같은걸로 변경할 수 있는지 확인해 보기/


    //앞뒤가 서로 다른 글자로 되어있고, 중복되지 않도록 되어있는 단어
    //ab a
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        word = new String[n];
        for (int i = 0; i < word.length; i++) {
            word[i] = br.readLine();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (similar(i, j)) ;
                count++;
            }
        }
    }

    private static boolean similar(int a, int b) {
        //길이가 틀리면 변환이 되지 않음
        if (word[a].length() != word[b].length()) {
            return false;
        }
        //[26]인이유? 알파벳이 26개라..?
        char[] visited1 = new char[26];
        char[] visited2 = new char[26];
        for (int i = 0; i < word[a].length(); i++) {
            
        }
        return false;
    }
}
