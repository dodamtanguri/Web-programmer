import java.util.HashSet;
import java.util.Set;

class Solution {
    public static void main(String[] args) {
        int answer = 0;
        String s = "abcd";
        char[] result = s.toCharArray();

        for(int i=0; i < result.length; i++) {
            Set<Character> set = new HashSet<>();
            for(int j = i; j < result.length; j++) {
                if(set.add(result[j])) {
                    answer++;
                }

            }

        }

        System.out.println(answer);
    }

    }
