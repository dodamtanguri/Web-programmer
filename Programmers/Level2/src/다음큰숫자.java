public class 다음큰숫자 {
    public int solution(int n) {
        int answer = Integer.bitCount(n);
        for (int i = n+1; i < 1000000; i++) {
            if (answer == Integer.bitCount(i)){
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
    다음큰숫자 test = new 다음큰숫자();
        System.out.println(test.solution(78));
    }
}
