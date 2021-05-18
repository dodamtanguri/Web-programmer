import java.util.ArrayList;
import java.util.Arrays;

public class 다트게임 {
    //https://programmers.co.kr/learn/courses/30/lessons/17682
    public int solution(String dartResult) {
        int answer = 0;
        String regExp = "\\D+";
        String regExp2 = "[0-9]+";
        String[] arr = dartResult.split(regExp);
        String[] bonus = dartResult.split(regExp2);
        System.out.println(bonus[1]);

        for (int i = 0; i<bonus.length; i++) {
            if (bonus[i] == null) {

            }else if (bonus[i].equals("S") ) {
                answer += Integer.parseInt(arr[i]);
            } else if (bonus[i].equals("D")) {
                answer += Math.pow(Integer.parseInt(arr[i]),2);

            } else if (bonus[i].equals("T")) {
                answer += Math.pow(Integer.parseInt(arr[i]),3);
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(bonus));
        return answer;
    }
        public static void main (String[]args){
            다트게임 test = new 다트게임();
            System.out.println(test.solution("10S2D*3T"));
        }
    }
