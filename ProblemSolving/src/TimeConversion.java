
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        DateFormat input = new SimpleDateFormat("hh:mm:ssaa");
        DateFormat output = new SimpleDateFormat("HH:mm:ss");
        String outputDate = "";

        Date date = null;
        try {
            date = input.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (date != null)
            outputDate = output.format(date);

        return outputDate;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
