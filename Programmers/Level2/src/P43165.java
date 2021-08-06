import com.sun.corba.se.spi.ior.IdentifiableFactoryFinder;

public class P43165 {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(numbers, 0, 0, target);
        return answer;
    }

    public int dfs(int[] numbers, int node, int sum, int target) {
        if (node == numbers.length) {
            if (sum == target) return 1;
            else return 0;

        } else {
            return dfs(numbers, node + 1, sum + numbers[node], target)
                    + dfs(numbers, node + 1, sum - numbers[node], target);
        }

    }

    public static void main(String[] args) {
        P43165 test = new P43165();
        int[] num = new int[]{1, 1, 1, 1};
        System.out.println(test.solution(num,3));
    }


}
