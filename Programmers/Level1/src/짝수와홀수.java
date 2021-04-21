public class 짝수와홀수 {
    public static void main(String[] args) {
        짝수와홀수 test = new 짝수와홀수();

        System.out.println(test.짝수와홀수(3));
    }

    public String 짝수와홀수(int num) {
        String answer = "";
        if (num % 2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }
        System.out.println(answer);
        return answer;

        //조건 ? 참 : 거짓
        //return num % 2 == 0 ? "Even":"Odd";

    }
}
