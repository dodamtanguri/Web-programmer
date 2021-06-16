public class Permutation {
    //중복이 없고 순서가 상관없음 >>
    //next

    public static void main(String[] args) {
        permutationString("abcd");
    }

    public static void permutationString(String str) {
        permutationString("", str);
    }

    private static void permutationString(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permutationString(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
            }
        }

    }

}
