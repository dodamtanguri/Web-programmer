public class 문자열다루기기본 {
    public boolean 문자열다루기기본(String s) {
        boolean answer = true;
        int length = s.length();
        if(length !=4 && length !=6) {
            return false;
        }
        for (int i = 0; i < length; i ++) {
            //charAt = 문장 인덱스에 해당하는 문자 추출
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        문자열다루기기본 test = new 문자열다루기기본();
        System.out.println(test.문자열다루기기본("a234"));
    }
}
