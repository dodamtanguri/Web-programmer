public class 시저암호 {
    public String 시저암호(String s, int n) {
        String answer = "";
        for (int i = 0; i< s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLowerCase(ch)) {
                ch = (char) ((ch + n % 26 - 'a') % 26 + 'a');
            } else if (Character.isUpperCase(ch)) {
                ch = (char) ((ch + n % 26 - 'A') % 26 + 'A');
            }

            answer += ch;

        }
        return answer;
    }

    public static void main(String[] args) {
        시저암호 test = new 시저암호();
        System.out.println(test.시저암호("AB",1));
    }
}
