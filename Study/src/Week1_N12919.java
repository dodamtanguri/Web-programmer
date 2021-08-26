import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Week1_N12919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer s = new StringBuffer(br.readLine());
        StringBuffer t = new StringBuffer(br.readLine());
        int answer = 0;

        while (s.length() < t.length()) {

            if (t.charAt(0) == 'A' && t.charAt(t.length() - 1) == 'B') {
                answer = 0;
            } else {
                //마지막 글자가 A인 경우
                if (t.charAt(t.length() - 1) == 'A') {
                    //A삭제
                    t.deleteCharAt(t.length() - 1);
                } else if (t.charAt(0) == 'B')
                    t.deleteCharAt(0).reverse();

            }


        }
        if (t.length() == s.length()) {
            // 문자열 비교
            if (s.toString().equals(t.toString())) {
                answer = 1;
            }

        }


        System.out.println("answer" + answer);
    }


    // 두 문자열의 길이가 같을때

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


}
