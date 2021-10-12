package Trenbe;

public class N3 {
    public static void main(String[] args) {
        N3 test = new N3();
        int[] arr = {2, 1, 3, 1, 4, 2, 1, 3};
        System.out.println(test.solution(arr));
    }

    public int solution(int[] arr) {
        int answer = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int k = i; k < arr.length; k++) {
                temp = indexOfIntArray(arr, arr[i]);
                answer = Math.min(answer, (temp - i));
            }
        }
        return answer;
    }

    private int indexOfIntArray(int[] arr, int num) {
        int returnVaule = -1;
        for (int k = 0; k < arr.length; k++) {
            if (num == arr[k]) {
                returnVaule = k;
                break;
            }

        }
        return returnVaule;
    }
}
