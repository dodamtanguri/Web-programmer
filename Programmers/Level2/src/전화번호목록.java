import java.util.HashMap;

public class 전화번호목록 {

    public static void main(String[] args) {
        전화번호목록 test = new 전화번호목록();
        String[] phone = new String[]{"119", "97674223", "1195524421"};

        System.out.println(test.solution(phone));
    }

    //한번호가 다른 번호의 접두어
    public boolean solution(String[] phone_book) {

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], i);
        }

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 1; j < phone_book[i].length(); j++) {
                if (map.containsKey(phone_book[i].substring(0, j))) {
                    return false;
                }
            }
        }
        return true;
    }
}
