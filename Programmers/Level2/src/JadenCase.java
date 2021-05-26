public class JadenCase {

    public static void main(String[] args) {
        JadenCase test = new JadenCase();
        System.out.println(test.solution("  for the last week"  ));
    }

    public String solution(String s) {

        String[] temp = s.toLowerCase().split(" ");

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < temp.length; i++) {
            String tempStr = temp[i];
            //공백이 2개일경우
            if (tempStr.equals("")) {
                sb.append(" ");
                continue;
            }
            sb.append(Character.toUpperCase(temp[i].charAt(0)))
                    .append(temp[i].substring(1)).append(" ");
        }
        //테스트 케이스 8번 마지막에 공백이 들어간 경우
        if (s.charAt(s.length()-1) != ' ') {
            return sb.toString().trim();
        } else {
            return sb.toString();
        }
    }
}
