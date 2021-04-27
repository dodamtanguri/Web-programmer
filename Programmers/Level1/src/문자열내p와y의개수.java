public class 문자열내p와y의개수 {
    public static void main(String[] args) {
        문자열내p와y의개수 test = new 문자열내p와y의개수();
        System.out.println(test.문자열내p와y의개수("Pyy"));
    }

    public boolean 문자열내p와y의개수(String s) {
        boolean answer = true;
        int yCount = 0;
        int pCount = 0;
        //String 형 변수.toCharArray() - 문자열을 char 형 배열로 바꾼다.
        char[] temp = s.toCharArray();
        for (int i = 0; i < temp.length; i++) {

            if (temp[i] == 'p' || temp[i] == 'P') {
                pCount++;
            } else if (temp[i] == 'y' || temp[i] == 'Y') {
                yCount++;
            }
        }
        if (pCount != yCount) {
            answer = false;
        } else {
            answer = true;
        }
        return answer;
    }
}
