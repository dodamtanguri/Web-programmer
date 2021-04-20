public class 평균구하기 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        평균구하기 test = new 평균구하기();
        test.평균구하기(arr);
    }

    public double 평균구하기(int[] arr) {
        double answer = 0;
        double temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp += arr[i];
        }
        answer = temp / arr.length;

        System.out.println(answer);

        return answer;
    }
}
