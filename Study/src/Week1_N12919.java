import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Week1_N12919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = new String(br.readLine());
        String t = new String(br.readLine());
        System.out.println(check(s,t));
    }


    private static int check(String s, String t) {

        // 두 문자열의 길이가 같을때
        if (t.length() == s.length()) {
            // 문자열 비교
            if (s.equals(t)) {
                return 1;
            }
            return 0;
        }
        //규칙을 적용했을 때 둘 중 1개는 성립 해야함.
        /*
        A---A
        B---B
        B---A
        위 3가지 경우는 가능하지만
        A---B
        의 경우는 불가능함.
        그래서 애초에 A---B의 경우 0을 반환하도록 함.
         */
        if (t.charAt(0) == 'A' && t.charAt(t.length() - 1) == 'B') {
            return 0;
        } else {
            //나머지 경우
            int answer = 0;
            //마지막 글자가 A인 경우
            if (t.charAt(t.length() - 1) == 'A') {
                //A삭제
                answer += check(s, t.substring(0, t.length() - 1));
            }

            if (t.charAt(0) == 'B') {
                String temp = new StringBuffer(t.substring(1, t.length())).reverse().toString();
                answer += check(s, temp);
            }

            return answer > 0 ? 1 : 0;
        }

    }
}
