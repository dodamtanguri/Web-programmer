import java.util.Arrays;

public class 최댓값과최솟값 {
    public String solution(String s) {
        String answer = "";
        String[] temp = s.split(" ");
        int[] tempNum = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
           tempNum[i] = Integer.parseInt(temp[i]);
        }
        Arrays.sort(tempNum);
        answer = Integer.toString(tempNum[0]) +" "+ Integer.toString(tempNum[tempNum.length-1]);
        return answer;
    }

    public static void main(String[] args) {
        최댓값과최솟값 test = new 최댓값과최솟값();
        System.out.println(test.solution("1 2 3 4"));
    }
}
