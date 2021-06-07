import java.util.HashMap;
import java.util.Iterator;

public class 위장 {
    public static void main(String[] args) {
        위장 test = new 위장();
        String[][] cloths = {
                {"yellowhat", "headgear"},
                {"bluesunglasses", "eyewear"},
                {"green_turban", "headgear"}
        };
        System.out.println(test.solution(cloths));
    }

    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> temp = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            String key = clothes[i][1]; //[의상의 이름, 의상의 종류]
            if (!temp.containsKey(key)) { // 맵에서 인자로 보낸 키가 있으면 true, 없으면 false
                temp.put(key, 1);
            } else {
                temp.put(key, temp.get(key) + 1);
            }
        }

        //HashMap의 전체출력시 반복문을 사용하지 않고 Iterator사용 가능
        Iterator<Integer> it = temp.values().iterator();
        while (it.hasNext()) {
            answer *= it.next() + 1;
        }
        //스파이가 아무것도 입지 않았을경우의 수를 1 빼줌.
        return answer - 1;
    }

}

