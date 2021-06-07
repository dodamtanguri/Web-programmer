import java.util.Arrays;

public class 구명보트 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int minPoint = 0;
        for (int maxPoint = people.length-1; minPoint <= maxPoint; maxPoint--) {
                if (limit >= people[minPoint] + people[maxPoint])
                    minPoint++;
                    answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] people = {70, 80, 50};
        구명보트 test = new 구명보트();
        System.out.println(test.solution(people,100));
    }
}
