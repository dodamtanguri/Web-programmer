import java.util.*;

class Solution {
    public String solution(String s1, String s2) {
        char[] arr1 = new char[s1.length()];
        char[] arr2 = new char[s2.length()];
        int t = 0;
        for (int i = s1.length() - 1; i > -1; i--) {
            arr1[t] = s1.charAt(i);
            t++;
        }
        int t2 =0;
        for(int i = s2.length()-1; i>-1; i--) {
            arr2[t2] = s2.charAt(i);
            t2++;
        }

        int count = 0;
        for (int idx = 0; idx < arr2.length; idx++) {

            if (arr1[idx] == arr2[idx]) {
                int k = 1;
                for (int i = idx - 1; i > -1; i--, k++) {
                    if (k < arr1.length) {
                        count++;
                        if (arr1[k] != arr2[i]) {
                            break;
                        }
                    }
                }
                break;
            }
        }
        count += 1;


        StringBuffer sb = new StringBuffer();
        sb.append(s1);
        sb.append(s2.substring(count));
        String answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s1 = new String("xyZA");
        String s2 = new String("ABCxy");
        String result = sol.solution(s1,s2);

        System.out.println(result);
    }

}