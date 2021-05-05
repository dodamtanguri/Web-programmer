public class 두정수사이의합 {
    public long solution(int a, int b) {
        long answer = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        } else if (a > b) {
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        } else {
            return a;

        }
        return answer;
    }

    public static void main(String[] args) {
        두정수사이의합 test = new 두정수사이의합();
        System.out.println(test.solution(3,5));
        System.out.println(test.solution(3,3));
        System.out.println(test.solution(5,3));
    }

}
