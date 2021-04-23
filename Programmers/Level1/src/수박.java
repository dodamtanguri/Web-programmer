public class 수박 {


    public String 수박(int n) {
        String answer = "";

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                answer += "수";
            } else {
                answer += "박";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        수박 test = new 수박();
        System.out.println(test.수박(3));
    }
}
