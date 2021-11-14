package ST11;

public class N2 {
    public static void main(String[] args) {
        N2 test = new N2();
        String s = "babaa";
        System.out.println(test.solution(s));
    }

    public int solution(String S) {
        if (S.length() < 3) {
            return 0;
        }
        int appear = 1;
        int max = 1;
        int num = 1;
        int temp = 0;
        char prev = S.charAt(0);
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) != prev) {
                if (appear > max)
                    max = appear;
                num++;
                appear = 1;
            } else
                appear++;

            prev = S.charAt(i);
        }
        if (appear > max)
            max = appear;

        temp = S.length() - max;
        return ((num - 1) * max) - temp;
    }
}

