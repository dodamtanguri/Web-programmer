public class 핸드폰번호가리기 {
    public static void main(String[] args) {
        핸드폰번호가리기 test = new 핸드폰번호가리기();
        test.핸드폰번호가리기("01033334444");
    }

    public String 핸드폰번호가리기(String phone_number) {
        String answer = "";
        for (int i = 0; i < phone_number.length(); i++) {
            if (i < phone_number.length() - 4) {
                answer += "*";
            } else {
                answer += phone_number.charAt(i);
            }
        }
        System.out.println(answer);
        return answer;
    }
}
