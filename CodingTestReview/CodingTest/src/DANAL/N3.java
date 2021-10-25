package DANAL;

public class N3 {
    static int[] dp;

    public static void main(String[] args) {
        N3 test = new N3();
        int[] arr = {12, 12, 12, 12, 12};
        System.out.println(test.solution(arr));
    }

    public int solution(int[] sticker) {
        int answer = 0;
        int len = sticker.length;

        if (len == 1) return sticker[0];

        int[] dpOne = new int[len];
        int[] dpTwo = new int[len];

        dpOne[0] = sticker[0];
        dpOne[1] = sticker[0];

        dpTwo[0] = 0;
        dpTwo[1] = sticker[1];

        for (int i = 2; i < len; i++) {
            dpOne[i] = Math.max(dpOne[i - 2] + sticker[i], dpOne[i - 1]);
            dpTwo[i] = Math.max(dpTwo[i - 2] + sticker[i], dpTwo[i - 1]);
        }
        for (int i = 0; i < len; i++) {
            answer = Math.max(dpOne[i], dpTwo[i]);
        }

        return answer;

    }
}