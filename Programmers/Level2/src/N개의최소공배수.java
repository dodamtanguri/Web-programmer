public class N개의최소공배수 {
    public static void main(String[] args) {
        N개의최소공배수 test = new N개의최소공배수();
        int[] arr = {2, 6, 8, 14};
        System.out.println(test.solution(arr));
    }

    public int solution(int[] arr) {

        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            temp = lcm(temp, arr[i]);
        }
        return temp;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
