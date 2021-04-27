import java.util.Arrays;

public class 문자열내림차순으로배치하기 {
    public String 문자열내림차순으로배치하기(String s) {

       char [] temp = new char[s.length()];
       temp = s.toCharArray();
        Arrays.sort(temp);
        StringBuilder answer = new StringBuilder(new String(temp));

        return answer.reverse().toString();
    }

    public static void main(String[] args) {
        문자열내림차순으로배치하기 test = new 문자열내림차순으로배치하기();
        System.out.println(test.문자열내림차순으로배치하기("Zbcdefg"));
    }
}
