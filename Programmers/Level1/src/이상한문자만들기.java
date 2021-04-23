public class 이상한문자만들기 {
    public static void main(String[] args) {
        이상한문자만들기 test = new 이상한문자만들기();
        System.out.println(test.이상한문자만들기("try hello world"));
    }

    public String 이상한문자만들기(String s) {
        String[] str = s.split("");
        String space = " ";
        int temp = 0;
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(space)) {
                temp = 0;
            } else {
                if (temp % 2 == 0) {
                    temp++;
                    str[i] = str[i].toUpperCase();
                } else {
                    temp++;
                    str[i] = str[i].toLowerCase();
                }
            }
            answer.append(str[i]);
        }
        return answer.toString();
    }
}
