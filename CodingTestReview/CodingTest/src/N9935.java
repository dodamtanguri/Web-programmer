import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N9935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();

        while (s.contains(t)){
            s = s.replaceAll(t,"");

        }
        if (s.isEmpty()) {
            System.out.println("FRULA");
        }else  {
            System.out.println(s);
            
        }

    }
}
