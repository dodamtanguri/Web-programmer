import java.util.ArrayList;
import java.util.Arrays;

public class 음양더하기 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int[] tempSigns = new int[signs.length];
        for (int i = 0; i < absolutes.length; i++) {
            if (!signs[i]) {
                tempSigns[i] = -1;
            } else  {
                tempSigns[i] = 1;
            }
            answer += absolutes[i] * tempSigns[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        음양더하기 test = new 음양더하기();
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};
        System.out.println(test.solution(absolutes,signs));
    }
}
