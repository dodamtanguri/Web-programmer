import java.util.ArrayList;
import java.util.List;

public class maxDifference {
    public static void main(String[] args) {
        int total = 5;
        int [] arr = new int [3];
        for(int i = 0; i < 3; i++) {
             arr[i] = i+1;
            System.out.println(arr[i]);
        }
        int min = arr[0];
        int diff = -1;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > min) {
                diff = Math.max(arr[i] - min, diff);
                min = Math.min(min,arr[i]);
            }
        }

        System.out.println(diff);

    }
}
