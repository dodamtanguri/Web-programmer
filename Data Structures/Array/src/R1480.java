import java.io.BufferedReader;
import java.io.InputStreamReader;

public class R1480 {
    public int[] runningSum(int[] nums) {
        int arr [] = new int [nums.length];
        int tem = 0;
        for(int i =0; i< nums.length; i++) {
            arr[i] = nums[i] + tem;
            tem += nums[i];
        }
        return arr;
    }
}
