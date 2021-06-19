import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DeliveryHeroTest {
    public static long countChar(String str, char ch) {
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }
    public String solution2(String S, String C) {
        // write your code in Java SE 8
        String answer = "";
        int tempSize = ((int)countChar(S,','))+1;
        StringTokenizer st = new StringTokenizer(S,",");
        String[] tempString = new String[tempSize];
        for (int i =0; i < tempString.length; i++) {
            tempString[i] = st.nextToken();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tempString.length; i++) {
            st = new StringTokenizer(tempString[i]," ");
        }



        System.out.println(Arrays.toString(tempString));

        return answer;
    }

    public static void main(String[] args) {
        DeliveryHeroTest test = new DeliveryHeroTest();
        System.out.println(test.solution2("John Doe, Peter Parker, James Doe","Example"));
    }
}
