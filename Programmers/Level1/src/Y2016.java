public class Y2016 {
    public String solution(int a, int b) {
        String answer = "";
        int[] months = {31,29,31,30,31,30,31,31,30,31,30,31};
        for (int i = 1; i < a; i++) {
            b += months[i-1];
        }
        switch (b % 7) {
            case 3:answer="SUN";break;
            case 4:answer="MON";break;
            case 5:answer="TUE";break;
            case 6:answer="WED";break;
            case 0:answer="THU";break;
            case 1:answer="FRI";break;
            case 2:answer="SAT";break;
        }
        return answer;
    }

    public static void main(String[] args) {
        Y2016 test = new Y2016();
        System.out.println(test.solution(5,24));
    }
}
