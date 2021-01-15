import java.util.Arrays;

// todo 1299. Replace Elements with Greatest Element on Right Side
class R1299 {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] output = new int[n];
        int max = -1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] = max;
            max = Math.max(arr[i], max);
        }
        return output;
    }

    public static void main(String[] args) {
        R1299 solution = new R1299();
        int[] arr = {17, 18, 5, 4, 6, 1};
        int[] result = solution.replaceElements(arr);
        System.out.println(Arrays.toString(result));
    }
}
