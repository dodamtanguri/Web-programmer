public class 하샤드수 {
    public static void main(String[] args) {
        하샤드수 test = new 하샤드수();
        test.하샤드수(13);
    }

    public boolean 하샤드수(int x) {
        boolean answer = true;
        int temp = 0;
        while (x > 1) {
            temp += x % 10;
            x /= 10;
        }
        if (x % temp == 0) {
            answer = true;
        } else {
            answer = false;
        }
        System.out.println(answer);
        return answer;
    }
}
