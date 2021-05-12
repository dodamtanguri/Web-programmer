import java.util.Arrays;
import java.util.stream.IntStream;

public class K번째수 {
    public static void main(String[] args) {
        K번째수 test = new K번째수();
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(test.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, commands)));
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int j = 0; j < commands.length; j++) {
            int[] temp;
            //Stream
            //Arrays.copyOfRange()
            temp = IntStream.range(commands[j][0] - 1, commands[j][1]).map(i -> array[i]).toArray();
            Arrays.sort(temp);
            answer[j] = temp[commands[j][2] - 1];
        }

        return answer;
    }

}
