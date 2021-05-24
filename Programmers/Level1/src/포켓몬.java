import java.util.ArrayList;
import java.util.HashSet;

public class 포켓몬 {
    public int solution(int[] nums) {
        int answer = 0;
        //ArrayList 이용해서 중복제거
        ArrayList<Integer> temp = new ArrayList<>();
        for (int number : nums) {
            if (!temp.contains(number))
                temp.add(number);
        }
        //HashSet 이용해서 중복제거
       /* HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }
        */
        if (temp.size() > nums.length/2) {
            answer = nums.length/2;
        } else {
            answer = temp.size();
        }
        // 3항연산자 이용
        // nums.length/2 > temp.size() ? temp.size() : nums.length/2;

        return answer;
    }

    public static void main(String[] args) {
        포켓몬 test = new 포켓몬();
        System.out.println(test.solution(new int[]{3,3,3,2,2,4}));
    }
}
