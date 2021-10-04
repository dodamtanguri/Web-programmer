package NaverWebtoon;

public class NaverWebToon2 {
    public static void main(String[] args) {
        NaverWebToon2 test = new NaverWebToon2();
        String s = "aabcbcd";
        String t = "abc";
        System.out.println(test.solution(s, t));
    }

    public int solution(String s, String t) {
        int result = 0;
        while (s.contains(t)) {
            s = s.replace(t, "");
            result++;
        }
        return result;
    }
}
