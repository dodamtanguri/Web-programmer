package 중고나라;

//가장 앞쪽의 이용자만 남겨두고 뒤에 중복 제거

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Stream;

public class P30475 {
    public static void main(String[] args) {
        P30475 test = new P30475();
        int[] waiting = {1, 5, 8, 2, 10, 5, 4, 6, 4, 8};
        System.out.println(Arrays.toString(test.solution(waiting)));
    }

    public int[] solution(int[] waiting) {

        Set<Integer> hashSet = new LinkedHashSet<>();

        for (int i : waiting) {
            hashSet.add(i);
        }

        Stream<Integer> set = hashSet.stream();
        int[] answer = new int[hashSet.size()];

        Iterator<Integer> it = set.iterator();
        for (int i = 0; i < answer.length; i++) {
            answer[i] = it.next();
        }

        return answer;

    }
}
